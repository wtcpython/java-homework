package cn.campsg.java.experiment.entity;

import java.util.Date;

public class OfficeBuilder extends Builder {
    @Override
    public boolean buildBase(Date endDate) {
        Date now = new Date();
        int compare = now.compareTo(endDate);
        if (compare > 0) {
            System.out.println("已完成商务办公楼的基础建设！");
            return true;
        } else {
            System.out.println("没有在计划完工时间内完成办公楼的基础建设，需要重新评估！");
            return false;
        }
    }

    @Override
    public void buildBody() {
        System.out.println("开始商务办公楼的主体房屋建设……！");
    }
}
