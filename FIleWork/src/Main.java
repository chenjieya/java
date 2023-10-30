import java.io.File;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        File source = new File("G:\\java\\IO_FILE_TEST\\abc.txt");
        File target = new File("G:\\java\\IO_FILE_TEST\\abc_copy.txt");
        FileCopy filecopy = new FileCopy(source, target, true);

    }
}