package cn.campsg.java.experiment;

import cn.campsg.java.experiment.entity.TextWriterReader;

public class MainClass {
    public static void main(String[] args) {
        TextWriterReader twr = new TextWriterReader();
        String s = "Hello World!";
        String fileLocation = "test.txt";
        try {
            twr.writeText(s, fileLocation);
            String content = twr.readText(fileLocation);
            System.out.println(content);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
