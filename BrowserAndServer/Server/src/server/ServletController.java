package server;

import domain.HttpServletRequest;
import domain.HttpServletResponse;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;

public class ServletController {

    private static HashMap<String,String>  configFileMap = new HashMap<>();
    private static HashMap<String,HttpServlet>  controllerObjMap = new HashMap<>();


    static {
        try {
            Properties properties = new Properties();
            properties.load(new FileReader("src//web.properties"));

            // 获取到properties文件的所有key
            Enumeration keys = properties.propertyNames();

            while(keys.hasMoreElements()) {

                // 获取元素
                String key = (String) keys.nextElement();
                String value = properties.getProperty(key);

                // 缓存到map中
                configFileMap.put(key,value);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    // 优化，该方法存在的问题，读取流的操作，应该不属于这个对象
    // 读取每次进来都会读取文件，应该缓存起来
    // 对象应该单一，不能被一直创建
    public static void findController(HttpServletRequest request, HttpServletResponse response) {

        // 创建单一对象(控制层的对象)
        String content = request.getContent();

        HttpServlet controllerObj = controllerObjMap.get(content);

        try{
            // 判断当前对象是否创建，没有创建对象进入里面
            if (controllerObj == null) {
                // 从缓存中能否读取出来对应的类全名
                String str = configFileMap.get(content);  // 从配置文件中获取类全名
                // 说明类全名读取成功，如果没有则说明配置文件或者Controller类出现了问题
                if (str != null) {

                    // 创建Controller层对象
                    Class<?> aClass = Class.forName(str);
                    controllerObj = (HttpServlet) aClass.newInstance();
                    controllerObjMap.put(content,controllerObj);
                }
            }

            // 代码至此：对象已经存在
            Class<? extends HttpServlet> controllerObjClass = controllerObj.getClass();
            Method method = controllerObjClass.getMethod("server", HttpServletRequest.class, HttpServletResponse.class);
            method.invoke(controllerObj, request, response);
        } catch (ClassNotFoundException e) {
            // 可能找不到类 Class<?> aClass = Class.forName(content); 有可能content名字写错了
            response.write("404-请求的Contriller不存在" + content);
        } catch(NoSuchMethodException e) {
            // 方法错粗，可能是server方法写错了
            response.write("405-获取Contriller方法时候失败，方法名不存在");
        } catch(Exception e) {
            e.printStackTrace();
        }

    }

}
