package cn.campsg.java.experiment.entity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextWriterReader {
    public TextWriterReader() {

    }

    public String readText(String fileLocation) throws IOException {
        StringBuffer sb = new StringBuffer();
        File file = new File(fileLocation);
        if (file.isFile() && file.exists()) {
            InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "UTF-8");

            BufferedReader br = new BufferedReader(isr);

            String s;
            while ((s = br.readLine()) != null) {
                sb.append(s + "\n");
            }
            br.close();
        } else {
            System.out.println("找不到指定的文本文件！");
        }
        return sb.toString();
    }

    public boolean writeText(String content, String fileLocation) throws IOException {
        File file = new File(fileLocation);
        boolean flag = false;
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(content.getBytes("UTF-8"));
        fos.close();
        flag = true;
        return flag;
    }
}
