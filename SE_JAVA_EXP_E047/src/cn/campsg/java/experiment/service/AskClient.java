package cn.campsg.java.experiment.service;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class AskClient implements Runnable {
    private Socket socket = null;
    private String askInfo = null;

    public AskClient(Socket socket, String askInfo) {
        this.socket = socket;
        this.askInfo = askInfo;
    }

    @Override
    public void run() {
        InputStream in = null;
        OutputStream os = null;
        try {
            os = socket.getOutputStream();
            in = socket.getInputStream();
        } catch (Exception ie) {
            System.out.println("建立与服务端连接时异常：@：" + ie.getMessage());
        }

        String ask = Thread.currentThread().getName() + ":请问[" + askInfo + "]在哪里登机？";
        try {
            os.write(ask.getBytes("UTF-8"));
            os.flush();
        } catch (IOException e) {
            System.out.println("服务端端已关闭或无法连接……@" + e.getMessage());
        }

        byte[] bytes = new byte[1024];

        try {
            in.read(bytes);
            System.out.println(Thread.currentThread().getName() + "咨询结果：" + new String(bytes).trim());
        } catch (IOException e) {
            System.out.println("获取返回结果时异常：@" + e.getMessage());
        }

        try {
            os.close();
            in.close();
            socket.close();
            System.out.println("咨询者已咨询完毕。");
        } catch (IOException e) {
            System.out.println("关闭客户端连接异常：@" + e.getMessage());
        }
    }
}
