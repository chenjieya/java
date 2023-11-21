import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(9999);

            Socket accept = serverSocket.accept();

            // 获取accept的流
            InputStream inputStream = accept.getInputStream();// 字节流
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);  // 字符
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String s = bufferedReader.readLine();

            while (s != null) {
                System.out.println(s);
                s = bufferedReader.readLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
