package controller;

import domain.HttpServletRequest;
import domain.HttpServletResponse;

public class IndexController {

    public void test(HttpServletRequest request, HttpServletResponse response) {
        // 获取到请求过来的信息
        System.out.println("我是Controller控制层的方法");
        // 找到某一个业务层的方法做事情

        // 将最终业务层执行完毕的方法返回出去 让服务器返回给浏览器

    }
}
