package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SqlFactory {


    public <T>T getMapper(Class clazz) {
        // 创建代理对象
        // loader 需要被代理的类 []   做拿一件事情

        ClassLoader loader = clazz.getClassLoader();
        Class[] classes = new Class[]{clazz};
        InvocationHandler invocat = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                System.out.println("proxy"+proxy.getClass().getName());
                System.out.println("method"+method.getName());
                System.out.println(args);

                return proxy;
            }
        };

        Object obj = Proxy.newProxyInstance(loader, classes, invocat);

        T t = (T) obj;

        return t;
    }


}
