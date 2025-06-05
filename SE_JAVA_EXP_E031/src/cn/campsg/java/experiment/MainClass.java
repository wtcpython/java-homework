package cn.campsg.java.experiment;

import cn.campsg.java.experiment.entity.Feeder;

public class MainClass {
    public static void main(String[] args) {
        Feeder feeder = new Feeder();
        feeder.feed();
        feeder.feed("华南虎");
    }
}
