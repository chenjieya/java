package listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class TestListener implements ServletRequestListener {

    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("Request对象销毁了");
    }

    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("Request对象创建了");
    }

}
