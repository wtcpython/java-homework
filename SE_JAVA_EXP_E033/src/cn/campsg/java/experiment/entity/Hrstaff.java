package cn.campsg.java.experiment.entity;

public class Hrstaff extends Employe {
    public Hrstaff() {
    }

    public Hrstaff(String name) {
        super(name, 5, 5000);
    }

    @Override
    public void work() {
        super.work();
        System.out.println(getName() + "平时需要组织员工多参加运动。");
    }

    public String looupSalary(int level) {
        if (level >= 1 && level <= 5)
            return "每月补贴500元";
        else if (level >= 6 && level <= 9)
            return "每月补贴800元";
        else if (level >= 10 && level <= 15)
            return "每月补贴1000元";
        else
            return "不存在对应职级。";
    }
}
