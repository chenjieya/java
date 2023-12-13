package controller;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.List;

@Controller
public class TestController {

//    @RequestMapping("upload.do")
//    public String upload(HttpServletRequest request) throws Exception {
//
//        // 获取磁盘选项得factory
//        DiskFileItemFactory factory = new DiskFileItemFactory();
//        // 创建一个ServletFileUpload对象
//        ServletFileUpload upload = new ServletFileUpload(factory);
//        // 让upload对象帮助我们解析request数据
//        List<FileItem> itemList = upload.parseRequest(request);
//
//        for (FileItem item : itemList) {
//
//            if (item.isFormField()) {
//                // 普通表单数据
//                String key = item.getFieldName();
//                String value = item.getString("UTF-8");
//                System.out.println(key + "=" + value);
//            } else{
//                // 文件数据
//                String fileName = item.getName();
//                System.out.println(fileName+"filenanme");
//                item.write(new File("G:\\java\\" + fileName));
//            }
//
//        }
//
//
//        return "welecome.jsp";
//    }


    @RequestMapping("upload.do")
    public String upload(String test, MultipartFile file) throws Exception {
        System.out.println(test);
        // 获取文件名
        String originalFilename = file.getOriginalFilename();
        System.out.println(originalFilename);
        // 上传文件
        file.transferTo(new File("G:\\java\\" + originalFilename));



        System.out.println("上传成功");
        return "welecome.jsp";
    }



    // 原生的方式下载文件
    @RequestMapping("download.do")
    public void download(HttpServletRequest request, HttpServletResponse response) throws Exception {

        // 读取请求过来的文件名
        String filename = request.getParameter("filename");
        // 创建文件输入流读取文件
        FileInputStream fileInputStream = new FileInputStream("G:\\java\\" + filename);
        // 处理一下文件名，如果服务端存储的文件名称有中文的话，需要处理一下
        // 为了浏览器下载展示的文件名是完整的，所以要处理一下
        filename = URLEncoder.encode(filename, "UTF-8");
        // 响应头信息
        response.setContentType("application/x-msdownload");
        response.setHeader("Content-Disposition", "attachment;filename=" + filename);

        // 正式开始写数据（输入流）
        ServletOutputStream outputStream = response.getOutputStream();

        byte[] bytes = new byte[1024];
        int len = fileInputStream.read(bytes); // 读取有效字节个数
        while (len != -1) {
            outputStream.write(bytes, 0, len);
            outputStream.flush();
            len = fileInputStream.read(bytes);
        }

    }


}
