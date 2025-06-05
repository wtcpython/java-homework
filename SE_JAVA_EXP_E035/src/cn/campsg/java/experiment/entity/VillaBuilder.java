package cn.campsg.java.experiment.entity;

import java.util.Date;

public class VillaBuilder extends Builder {
    @Override
    public boolean buildBase(Date endDate) {
        Date now = new Date();
        long result = (now.getTime() - endDate.getTime()) / (24 * 60 * 60 * 1000) + 5;
        if (result > 0) {
            System.out.println("已完成欧式风格的别墅地基建设！");
            return true;
        } else {
            System.out.println("没有在计划完工时间内完成办别墅的基础建设，需要重新评估！");
            return false;
        }
    }

    @Override
    public void buildBody() {
        System.out.println("开始进行欧式风格的别墅主体建设……！");
    }
}
