package com.example.server;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {

    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(9000);
        Socket socket = serverSocket.accept();

        StringBuffer sb = new StringBuffer();
        sb.append("HTTP/2 200 OK\r\n");
        sb.append("Content-type: text/plain\r\n");
        sb.append("\r\n");
        sb.append("Hello world!\r\n");

        PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
        printWriter.print(sb);
        //전송
        printWriter.flush();
        socket.close();
        serverSocket.close();
    }

}
