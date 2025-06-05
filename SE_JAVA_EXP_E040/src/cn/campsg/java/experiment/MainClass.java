package cn.campsg.java.experiment;

import cn.campsg.java.experiment.entity.DrawReward;

public class MainClass {
    public static void main(String[] args) {
        DrawReward draw = new DrawReward();
        for (int i = 0; i < 10; i++) {
            int rdKey = (int) (Math.random() * 100);
            if (rdKey != 1 && rdKey != 2 && rdKey != 8)
                rdKey = 0;
            draw.draward(rdKey);
        }
        draw.showSurplus();
    }
}
