package network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/8/8 22:20
 */
public class TcpEchoClient {
    private Socket socket = null;

    public TcpEchoClient() throws IOException {
        // new 这个对象，需要和服务器建立连接
        socket = new Socket("127.0.0.1",8000);
    }

    public void start() throws IOException {
        Scanner scanner = new Scanner(System.in);
        try (InputStream inputStream = socket.getInputStream();
             OutputStream outputStream = socket.getOutputStream()) {
            Scanner scannerNet = new Scanner(inputStream);
            PrintWriter  printWriter = new PrintWriter(outputStream);
            while(true) {
                // 1. 从控制台读取用户的输入
                System.out.print("> ");
                String request = scanner.next();
                // 2. 把请求发送给服务器
                printWriter.println(request);
                printWriter.flush();
                // 3. 从服务器读取响应
                String response = scannerNet.next();
                // 4. 把结果显示到界面上
                System.out.printf("req: %s; resp: %s\n",request,response);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        TcpEchoClient tcpEchoClient = new TcpEchoClient();
        tcpEchoClient.start();
    }
}
