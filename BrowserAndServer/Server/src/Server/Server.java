package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public void startServer() {

        try {

            // 创建ServerSocket对象，指定监听的端口号
            ServerSocket server = new ServerSocket(10000);
            System.out.println("等待和客户端建立连接。。。");

            while(true) {
                // 同意和客户端建立连接
                Socket clientSocket = server.accept();
                System.out.println("和客户端建立连接成功");

                // 将这个客户端交给线程去处理
                new ServerHandler(clientSocket).start();

            }




        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
