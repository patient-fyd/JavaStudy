package network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/8/5 10:47
 */
public class UdpEchoServer {
    /**
     *     要想创建 UDP 服务器，要先打开一个 socket 文件
     */
    private DatagramSocket socket = null;

    public UdpEchoServer(int port) throws SocketException {
        socket = new DatagramSocket(port);
    }

    public void start() throws IOException {
        System.out.println("服务器启动！");
        while (true) {
            // 1. 读取客户端发来的请求
            DatagramPacket requestPacket = new DatagramPacket(new byte[4096],4096);
            socket.receive(requestPacket);
            // 2. 对请求进行解析，把 DatagramPacket 转成一个 String
            String request = new String(requestPacket.getData(),0,requestPacket.getLength());
            // 3. 根据请求，处理响应。
            String response = process(request);
            // 4. 把响应构造成 DatagramPacket 对象。
            //    构造响应对象，要搞清楚，对象要发给谁
            DatagramPacket responsePacket = new DatagramPacket(response.getBytes(),response.getBytes().length,
                    requestPacket.getSocketAddress());
            // 5. 把这个 DatagramPacket 对象返回给客户端。
            socket.send(responsePacket);
            System.out.printf("[%s:%d] req = %s; resp = %s\n", requestPacket.getAddress().toString(),
                    requestPacket.getPort(),request,response);
        }
    }
    /**
     *     通过这个方法，实现根据请求计算响应 这个过程
     */
    public String process(String req) {
        return req;
    }

    // 和 UdpEchoServer 相比, 只是 process 不同, 就重写这个方法即可!
    public static void main(String[] args) throws IOException {
        UdpEchoServer server = new UdpEchoServer(8000);
        server.start();
    }
}

