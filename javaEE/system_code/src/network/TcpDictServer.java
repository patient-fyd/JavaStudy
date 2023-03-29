package network;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/8/10 16:57
 */
public class TcpDictServer extends TcpEchoServer {
    private Map<String, String> dict = new HashMap<>();


    public TcpDictServer(int port) throws IOException {
        super(port);

        dict.put("cat","小猫");
        dict.put("dog","小狗");
        dict.put("fuck","卧槽");
    }

    @Override
    public String process(String request) {
        return dict.getOrDefault(request,"我也不知道");
    }

    public static void main(String[] args) throws IOException {
        TcpDictServer server = new TcpDictServer(8000);
        server.start();
    }
}
