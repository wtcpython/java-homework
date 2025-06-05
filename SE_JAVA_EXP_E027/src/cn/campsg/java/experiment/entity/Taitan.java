package cn.campsg.java.experiment.entity;

public class Taitan {
    private int blood;

    public Taitan() {
        blood = 700;
    }

    public Taitan(int blood) {
        this.blood = blood;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void attack(Zeus zeus) {
        int damage = (int) (Math.random() * 101);
        zeus.setBlood(zeus.getBlood() - damage);
        System.out.println("泰坦攻击宙斯，宙斯扣血：" + damage + "，剩余：" + zeus.getBlood());
    }
}
