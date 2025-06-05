package cn.campsg.java.experiment;

import cn.campsg.java.experiment.entity.Consumer;
import cn.campsg.java.experiment.entity.Producer;
import cn.campsg.java.experiment.entity.SharePool;

public class MainClass {
    public static void main(String[] args) {
        SharePool pool = new SharePool();

        for (int i = 1; i <= 5; i++) {
            new Thread(new Producer(pool, i)).start();
        }

        new Thread(new Consumer(pool)).start();
    }
}
