package listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class ServletListener implements ServletRequestListener, ServletRequestAttributeListener {


    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("request对象销毁了");
    }

    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("request对象初始化了");
    }


    // 监听attribute的变化
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        System.out.println("request对象的attribute属性赋值了");
    }

    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        System.out.println("request对象的attribute属性被删除了");
    }

    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        System.out.println("request对象的attribute属性值进行了更改");
    }

}
