package cn.campsg.java.experiment;

import cn.campsg.java.experiment.service.FetchWeb;

public class MainClass {
    public static void main(String[] args) {
        FetchWeb fw = new FetchWeb();
        String url = "https://www.baidu.com/";
        System.out.println("获取百度首页内容：\n" + fw.fetchByHttp(url));

    }
}
