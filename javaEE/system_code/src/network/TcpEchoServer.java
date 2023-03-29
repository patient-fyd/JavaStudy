package network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.util.concurrent.Executors.*;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/8/8 22:20
 */
public class TcpEchoServer {
    private ServerSocket serverSocket = null;

    public TcpEchoServer(int port) throws IOException {
        serverSocket = new ServerSocket(port);
    }

    public void start() throws IOException {
        System.out.println("服务器启动！");
        ExecutorService service = newCachedThreadPool();
        while(true) {
            // 如果当前没有客户端来建立连接，就会阻塞等待
            Socket clientSocket = serverSocket.accept();

            // 版本1 单线程版本，无法处理多个客户端
            //processConnect(clientSocket);

            // 版本2 涉及到频繁的创建销毁线程，在高并发的情况下，负担比较重
            /*Thread t = new Thread(() -> {
                try {
                    processConnect(clientSocket);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            t.start();*/

            // 版本3 使用线程池，来解决频繁创建销毁线程的问题
            service.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        processConnect(clientSocket);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
        }
    }

    private void processConnect(Socket clientSocket) throws IOException {
        System.out.printf("[%s:%d] 建立连接!\n", clientSocket.getInetAddress().toString(), clientSocket.getPort());
        try (InputStream inputStream = clientSocket.getInputStream();
             OutputStream outputStream = clientSocket.getOutputStream()){
            Scanner scanner = new Scanner(inputStream);
            PrintWriter printWriter = new PrintWriter(outputStream);

            // 这里是长连接的写法，需要通过循环来获取到多次交互情况。
            while (true) {
                if (!scanner.hasNext()) {
                    // 连接断开
                    System.out.printf("[%s:%d] 断开连接!\n", clientSocket.getInetAddress().toString(), clientSocket.getPort());
                    break;
                }
                // 1. 读取请求并解析
                String request = scanner.next();
                // 2. 根据请求计算响应
                String response = process(request);
                // 3. 把响应写回给客户端
                printWriter.println(response);
                // 刷新一下缓冲区，避免数据没有真的发出去
                printWriter.flush();
                System.out.printf("[%s:%d] req: %s; resp: %s\n",
                        clientSocket.getInetAddress().toString(), clientSocket.getPort(),
                        request, response);
            }
        }  finally {
            clientSocket.close();
        }
    }

    public String process(String request) {
        return request;
    }

    public static void main(String[] args) throws IOException {
        TcpEchoServer server = new TcpEchoServer(8000);
        server.start();
    }

}