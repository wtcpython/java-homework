package cn.campsg.java.experiment;

import cn.campsg.java.experiment.entity.Employe;
import cn.campsg.java.experiment.entity.Hrstaff;

public class MainClass {
    public static void main(String[] args) {
        Employe emp = new Employe("张三", 4, 1000);
        Hrstaff hr = new Hrstaff("李四");
        Company cp = new Company();
        cp.appraisals(emp);
        cp.appraisals(hr);
    }
}
