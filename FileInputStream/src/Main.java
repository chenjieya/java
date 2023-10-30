import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileInputStream fs = null;
        try {
            fs = new FileInputStream("G:\\java\\IO_FILE_TEST\\test.txt");
            int v = fs.	available();
            System.out.println(v);  //21  先有个印象
            byte[] data = new byte[5];
            int count = fs.read(data);   // 去文件里面读东西 装入数组里面  读取到的有效数字个数

            while (count != -1){
                String value = new String(data, 0, count);
                System.out.print(value);
                count = fs.read(data);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
               if (fs != null) {
                   fs.close();
               }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


//        FileInputStream fs = null;
//        try {
//            File file = new File("G:\\java\\IO_FILE_TEST\\test.txt");
//            fs = new FileInputStream(file);
//            int code = fs.read();   // 读取一个字节
//
//            while(code != -1) {
//                char cd = (char) code;
//                System.out.print(cd);
//                code = fs.read();
//            }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }finally {
//            try {
//                if (fs != null) {
//                    fs.close();
//                }
//            } catch (IOException e) {
//               e.printStackTrace();
//            }
//        }
    }
}