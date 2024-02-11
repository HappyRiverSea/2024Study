package com.example.client;

import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class SocketClient {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("127.0.0.1", 9000);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("보냅니다.".getBytes(StandardCharsets.UTF_8));
        socket.close();
        System.exit(0);
    }
}
