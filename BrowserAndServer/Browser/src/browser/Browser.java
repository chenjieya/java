package browser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Browser {

    private Scanner inp = new Scanner(System.in);
    private Socket socket;
    public void open() {

        // 用户输入一个地址
        System.out.println("请输入要访问的地址：");
        String url = inp.nextLine();

        // 解析网络地址
        this.parseUrl(url);
    }

    private void parseUrl(String url) {
        // IP:PORT/资源？参数=值

        int portIndex = url.indexOf(":");
        int slashIndex = url.indexOf("/");

        // ip
        String ip = url.substring(0, portIndex);
        // port
        Integer port = Integer.parseInt(url.substring(portIndex + 1, slashIndex));
        // 资源参数
        String resource = url.substring(slashIndex + 1);

        this.request(ip, port, resource);
    }

    // 将内容发送给服务器
    private void request(String ip, Integer port, String resource) {

        try {
            // 和服务端建立连接
            socket = new Socket(ip, port);

            // 将资源通过流的方式发送给服务端
            PrintWriter out = new PrintWriter(socket.getOutputStream());

            out.println(resource);
            out.flush();

            // 浏览器等待信息
            this.receiptResponse();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void receiptResponse() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // 接受服务端的消息
            String res = in.readLine();
            System.out.println(res);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
