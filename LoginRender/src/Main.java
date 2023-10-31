import java.io.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        File file = new File("G:\\java\\IO_FILE_TEST\\login.txt");
        BufferedReader br = null;
        FileReader fr = null;
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);

            String str = br.readLine();

            while(str != null) {
                String[] strs = str.split("-");
                System.out.println(str);

                if (strs[0].equals("alvis") && strs[1].equals("666")) {
                    System.out.println("登录成功");
                    return;
                }
                str = br.readLine();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            }catch (IOException e) {
                e.printStackTrace();
            }

            try {
               if (br != null) {
                   br.close();
               }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("登录失败");

    }
}