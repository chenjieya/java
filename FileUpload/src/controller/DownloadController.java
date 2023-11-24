package controller;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;

public class DownloadController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 获取参数（文件名称）
        String filename = request.getParameter("filename");
        // 从服务器找到这个文件（需要输入流读取这个文件）
        InputStream inp = new FileInputStream("G:\\java\\uploadFile\\"+filename);
        // 如果文件名含有中文，如下处理
        filename = URLEncoder.encode(filename, "utf-8");
        // 设置浏览器得响应类型(浏览器弹出下载框)
        response.setContentType("application/x-msdownload");
        // 设置浏览器响应的文件名称
        response.setHeader("Content-disposition", "attachment;filename="+filename);

        // 将内容响应给浏览器
        ServletOutputStream outputStream = response.getOutputStream();

        byte[] buffer = new byte[1024];
        int length = inp.read(buffer);  // 读取文件，存储到buffer

        while(length != -1) {
            outputStream.write(buffer, 0 , length);
            outputStream.flush();
            length = inp.read(buffer);
        }

    }
}
