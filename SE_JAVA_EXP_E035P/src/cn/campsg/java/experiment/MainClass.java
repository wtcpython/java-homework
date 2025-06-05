package cn.campsg.java.experiment;

import cn.campsg.java.experiment.entity.PopSinger;

public class MainClass {
    public static void main(String[] args) {
        PopSinger singer = new PopSinger();
        singer.introduce();
        singer.sing();
    }
}
