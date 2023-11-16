package Server;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerHandler extends Thread {
    private Socket clientSocket;

    public ServerHandler() {}
    public ServerHandler(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    public void run() {
        // 读取消息

        // 解析消息

        // 找人做事

        // 返回消息
    }

    private void readMessage() {}

    private void partseMessage() {}

    private void findController() {}

    private void responseToBrowser() {}


}
