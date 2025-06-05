package cn.campsg.java.experiment.entity;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DrawReward {
    private Map<Integer, Awards> rwdPool = null;

    public DrawReward() {
        this.rwdPool = new HashMap<>();
        this.rwdPool.put(8, new Awards("特等奖", 1));
        this.rwdPool.put(1, new Awards("一等奖", 4));
        this.rwdPool.put(2, new Awards("二等奖", 6));
        this.rwdPool.put(0, new Awards("三等奖", 100));
    }

    public void draward(int rdKey) {
        Awards aw = this.rwdPool.get(rdKey);
        if (aw == null) {
            return;
        }

        int count = aw.getCount();
        if (count < 1) {
            System.out.println(aw.getName() + "，该奖项已抽完。");
        }
        aw.setCount(count - 1);
        System.out.println("抽奖结果：" + aw.getName());
    }

    public void showSurplus() {
        Iterator<Awards> itor = rwdPool.values().iterator();
        while (itor.hasNext()) {
            Awards aw = itor.next();
            System.out.println(aw.getName() + ";剩余奖项数量：" + aw.getCount());
        }
    }
}
