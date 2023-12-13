package controller;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
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

}
