package cn.campsg.java.experiment.service;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class DeskServer implements Runnable {
    private Socket socket = null;

    public DeskServer(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        InputStream in = null;
        OutputStream os = null;
        try {
            os = socket.getOutputStream();
            in = socket.getInputStream();
        } catch (IOException ie) {
            System.out.println("服务端处理客户端连接时异常：" + ie.getMessage());
        }

        try {
            byte[] bytes = new byte[1024];
            int len = in.read(bytes);
            if (len != -1) {
                String ask = new String(bytes, 0, len).trim();
                System.out.println("服务端@前端咨询内容为:" + ask);
                String result = "";

                if (ask.contains("CA")) {
                    result = "乘客您好，国航在2楼9号登机口!\r";
                } else if (ask.contains("CZ")) {
                    result = "乘客您好，南航在1楼6号登机口!\r";
                } else if (ask.contains("FM")) {
                    result = "乘客您好，上航在2楼12号登机口!\r";
                } else {
                    result = "乘客您好，抱歉，暂无您的航班登机信息!\r";
                }
                os.write(result.getBytes("UTF-8"));
                os.flush();
            }

        } catch (IOException e) {// 捕获异常并处理
            System.out.println("客户端已关闭,等待重新连接……@" + e.getMessage());
        } finally {
            try {
            Thread.sleep(1000);
            } catch (InterruptedException e) {
            e.printStackTrace();
            }
        }
    }
}
