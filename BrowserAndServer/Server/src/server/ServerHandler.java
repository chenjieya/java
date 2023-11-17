package server;

import domain.HttpServletRequest;
import domain.HttpServletResponse;

import java.io.*;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.HashMap;
import java.util.Properties;

public class ServerHandler extends Thread {
    private Socket clientSocket;

    public ServerHandler() {}
    public ServerHandler(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    public void run() {
        // 读取消息
        this.readMessage();
        // 解析消息

        // 找人做事

        // 返回消息
    }

    private void readMessage() {
        try {
            InputStream inputStream = clientSocket.getInputStream();
            InputStreamReader is = new InputStreamReader(inputStream);
            BufferedReader br = new BufferedReader(is);

            String str = br.readLine();

            // 解析消息
            this.parseMessage(str);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void parseMessage(String str) {
        // content[?index=123&a=123&b=123]
        String content;
        HashMap<String,String> paramsObj = null;

        int index = str.indexOf("?");

        // 说明问号存在
        if (index != -1) {

            content = str.substring(0,index);

            String tempParam = str.substring(index+1);
            String[] tempParamsArr = tempParam.split("&");

            paramsObj = new HashMap<>();

            // [index=123, a=123]
            for (String tempParamStr : tempParamsArr) {
                String[] temp = tempParamStr.split("=");
                paramsObj.put(temp[0],temp[1]);
            }

        } else {
            content = str;
        }

        System.out.println("content:" + content + ", paramsObj:" + paramsObj);

        // 找控制层
        // 将参数和资源等信息放到对象里面
        // 将返回消息的信息放到仓库里面
        HttpServletRequest request = new HttpServletRequest(content, paramsObj);
        HttpServletResponse response = new HttpServletResponse();
        this.findController(request, response);
    }

    private void findController(HttpServletRequest request, HttpServletResponse response) {

        // 为了方便，我们写不同的请求资源没必要来重写一边服务器的代码
        // 所以我们将对应关系放到了文件里面
        // 读取配置文件
        try {
            // 网络请求过来的资源
            String content = request.getContent();

            Properties properties = new Properties();
            properties.load(new FileReader("src//web.properties"));
            // 读取文件获取到类全名 index -> controller.IndexController
            String fullName = properties.getProperty(content);

            Class<?> controllerClass = Class.forName(fullName);
            Method method = controllerClass.getMethod("test", HttpServletRequest.class, HttpServletResponse.class);

            method.invoke(controllerClass.newInstance(), request, response);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        // 使用反射找到对象类（控制层类），并调用方法

    }

    private void responseToBrowser() {}


}
