package com.example.server;

import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {

    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(9000);
        Socket socket = serverSocket.accept();

        socket.close();
        System.out.println("socket close");
        serverSocket.close();
        System.out.println("serversocket close");
        System.out.println("SocketServer close");
        System.exit(0);
    }

}
