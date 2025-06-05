package cn.campsg.java.experiment.entity;

public class Hrstaff extends Employe {
    public Hrstaff() {
        super();
    }

    public Hrstaff(String name) {
        super(name, 5, 5000);
    }

    public void paySalary(Employe em) {
        int level = em.getLevel();
        if (level >= 1 && level <= 5) {
            em.setSalary(em.getSalary() + 500);
        } else if (level > 5 && level < 10) {
            em.setSalary(em.getSalary() + 800);
        } else if (level >= 10 && level <= 15) {
            em.setSalary(em.getSalary() + 1000);
        } else {
            System.out.println("不存在对应的职级，无法发放额外浮动薪水");
        }
    }
}
