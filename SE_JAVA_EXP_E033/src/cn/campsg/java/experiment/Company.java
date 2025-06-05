package cn.campsg.java.experiment;

import cn.campsg.java.experiment.entity.Employe;
import cn.campsg.java.experiment.entity.Hrstaff;

public class Company {
    public void appraisals(Employe emp) {
        emp.work();
        if (emp instanceof Hrstaff hr) {
            int level = emp.getLevel();
            System.out.println("HR的雇员等级为:" + level + "," + hr.looupSalary(level));
        }
    }
}
