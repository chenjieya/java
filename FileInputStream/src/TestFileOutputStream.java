import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {
    public static void main(String[] args) {

        FileOutputStream fs = null;
        try {
            File file = new File("G:\\java\\IO_FILE_TEST\\abc.txt");
            fs = new FileOutputStream(file, true);
            fs.write(49);
            fs.write('+');
            fs.write(49);
            fs.write('=');
            fs.write(50);

            byte[] bt = new byte[]{97,98,99};
            fs.write(bt);  // 写入字节文件

            String str = new String("我爱你李舒淇");
            byte[] bts = str.getBytes();

            fs.write(bts);


            System.out.println("文件写入完毕");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fs != null) {
                    fs.close();
                    System.out.println("文件流关闭");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
