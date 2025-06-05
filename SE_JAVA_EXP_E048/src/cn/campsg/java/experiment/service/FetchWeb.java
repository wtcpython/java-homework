package cn.campsg.java.experiment.service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class FetchWeb {
    public FetchWeb() {

    }

    public String fetchByHttp(String url) {
        StringBuffer sb = new StringBuffer();
        HttpURLConnection connection = null;
        try {
            URL u = new URL(url);
            // URL u = new URI(url).toURL();
            connection = (HttpURLConnection) u.openConnection();
            connection.setRequestMethod("GET");
            int code = connection.getResponseCode();
            if (code == 200) {
                InputStream in = connection.getInputStream();
                InputStreamReader isr = new InputStreamReader(in, "utf-8");
                BufferedReader br = new BufferedReader(isr);
                String line = null;
                while ((line = br.readLine()) != null) {
                    sb.append(line).append("\n");
                }
                br.close();
                isr.close();
                in.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
        return sb.toString();
    }
}
