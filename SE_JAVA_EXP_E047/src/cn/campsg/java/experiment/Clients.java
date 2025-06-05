package cn.campsg.java.experiment;

import java.net.Socket;

import cn.campsg.java.experiment.service.AskClient;

public class Clients {
    public static void main(String[] args) {
        String srvIP = "127.0.0.1";
        int srvPort = 9999;
        try {
            Socket socket1 = new Socket(srvIP, srvPort);
            Socket socket2 = new Socket(srvIP, srvPort);
            Socket socket3 = new Socket(srvIP, srvPort);
            Socket socket4 = new Socket(srvIP, srvPort);

            new Thread(new AskClient(socket1, "CA1893"), "问询者@CA1893").start();
            new Thread(new AskClient(socket2, "CZ3590"), "问询者@CZ3590").start();
            new Thread(new AskClient(socket3, "FM9802"), "问询者@FM9802").start();
            new Thread(new AskClient(socket4, "XS9882"), "问询者@XS9882").start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
