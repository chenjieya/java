import java.io.File;

public class TestFile {

    public void printFile(File file) {
        File[] files = file.listFiles();

        // 是否存在子文件  子文件是否是文件
        if (files != null && files.length > 0) {
            for (File f : files) {
                this.printFile(f);
            }
        }

        // 打印文件
        System.out.println(file);
    }

    public void deleteFile(File file) {
        File[] files = file.listFiles();

        // 是否存在子文件  子文件夹是否为空
        if (files != null && files.length > 0) {
            for (File f : files) {
                this.deleteFile(f);
            }
        }

        // 删除文件和文件夹
        file.delete();
    }

}
