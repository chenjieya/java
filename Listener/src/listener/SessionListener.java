package listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListener implements HttpSessionListener, HttpSessionAttributeListener {

    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("session对象创建了");
    }

    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("session对象销毁了");
    }


    // --- attribute
    public void attributeAdded(HttpSessionBindingEvent se) {
        System.out.println("session的atribute添加属性");
    }

    public void attributeRemoved(HttpSessionBindingEvent se) {
        System.out.println("session的atribute删除属性");
    }

    public void attributeReplaced(HttpSessionBindingEvent se) {
        System.out.println("session的atribute修改属性值");
    }


}
