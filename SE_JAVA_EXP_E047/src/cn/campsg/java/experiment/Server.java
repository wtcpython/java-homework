package cn.campsg.java.experiment;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import cn.campsg.java.experiment.service.DeskServer;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        int port = 9999;
        int counter = 0;

        try {
            serverSocket = new ServerSocket(port);
            while (true) {
                Socket client = serverSocket.accept();
                System.out.println("已获取客户端连接@" + client);
                counter++;
                new Thread(new DeskServer(client), "客户端@ " + counter).start();
            }
        } catch (IOException e) {
            System.out.println("服务器端出错……" + e.getMessage());
        }
    }
}
