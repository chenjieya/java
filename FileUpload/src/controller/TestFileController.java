package controller;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;

public class TestFileController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");

        try {
            // 需要创建一个工厂
            DiskFileItemFactory factory = new DiskFileItemFactory();

            // 设置缓冲区大小
            //factory.setSizeThreshold(1024000);
            // 设置缓冲区位置
            // factory.setRepository(new File());

            // 创建一个上传对象，构造方法需要这个工厂
            ServletFileUpload upload = new ServletFileUpload(factory);

            // 设置上传单个文件大小
            // upload.setFileSizeMax();
            // 设置总共文件得总大小
            // upload.setSizeMax();
            // 将参数交给upload对象的方法重构
            List<FileItem> fileList = upload.parseRequest(request);


            for (FileItem fileItem : fileList) {
                if (fileItem.isFormField()) {  // 普通得参数

                    String key = fileItem.getFieldName();
                    // String val = fileItem.getString();
                    String value = fileItem.getString("UTF-8");

                    System.out.println(key+"----"+value);

                } else{  // 文件参数

                    String key = fileItem.getFieldName();
                    String fileName = fileItem.getName();

                    System.out.println(key+"------"+fileName);

                    InputStream inp = fileItem.getInputStream();  // 获取到输入流

                    // 框架
                    fileItem.write(new File("G:\\java\\uploadFile\\" + fileName));


                    // 原生方法
//                    FileOutputStream fileOutputStream = new FileOutputStream("G:\\java\\uploadFile\\" + fileName);
//
//                    byte[] b = new byte[1024];
//                    int read = inp.read(b);
//
//                    while (read!=-1) {
//
//                        fileOutputStream.write(b, 0, read);
//                        fileOutputStream.flush();
//
//                        read = inp.read(b);
//                    }
//
//                    fileOutputStream.close();

                }
            }




        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
