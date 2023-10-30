import java.io.File;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        TestFile ts = new TestFile();
        File file = new File("G:\\java\\IO_FILE_TEST");
        ts.printFile(file);

        ts.deleteFile(file);
    }
}