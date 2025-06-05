package cn.campsg.java.experiment;

import cn.campsg.java.experiment.entity.Employe;
import cn.campsg.java.experiment.entity.Hrstaff;

public class MainClass {
    public static void main(String[] args) {
        Employe e1 = new Employe("张三", 5, 5000);
        Employe e2 = new Employe("李四", 10, 8000);
        Employe e3 = new Employe("王五", 15, 10000);
        Hrstaff h1 = new Hrstaff("赵六");
        e1.work();
        e2.work();
        e3.work();
        h1.work();

        h1.paySalary(e1);
        h1.paySalary(e2);
        h1.paySalary(e3);
        h1.paySalary(h1);

        System.out.println(e1.getName() + "的薪水：" + e1.getSalary());
        System.out.println(e2.getName() + "的薪水：" + e2.getSalary());
        System.out.println(e3.getName() + "的薪水：" + e3.getSalary());
        System.out.println(h1.getName() + "的薪水：" + h1.getSalary());
    }
}
