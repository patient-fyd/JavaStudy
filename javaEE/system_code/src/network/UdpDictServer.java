package network;

import java.io.IOException;
import java.net.SocketException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Fourteen-Y
 * @Description: 字典服务器/翻译服务器，
 * 请求是一个英文单词，响应是一个中文翻译
 * @Date: 2022/8/5 22:14
 */
public class UdpDictServer extends UdpEchoServer {
    private Map<String, String> dict = new HashMap<>();

    public UdpDictServer(int port) throws SocketException {
        super(port);

        // 这里的数据可以无限的构造下去......
        dict.put("cat", "小猫");
        dict.put("dog", "小狗");
        dict.put("apple","苹果");
    }

    /**
     *     和 UdpEchoServer 相比, 只是 process 不同, 就重写这个方法即可!
     */
    @Override
    public String process(String req) {
        return dict.getOrDefault(req, "这个词我也不会!");
    }

    public static void main(String[] args) throws IOException {
        UdpDictServer server = new UdpDictServer(8000);
        server.start();
    }
}
