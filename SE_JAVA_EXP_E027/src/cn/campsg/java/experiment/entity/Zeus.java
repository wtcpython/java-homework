package cn.campsg.java.experiment.entity;

public class Zeus {
    private int blood;

    public Zeus() {
        blood = 1000;
    }

    public Zeus(int blood) {
        this.blood = blood;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void attack(Taitan taitan) {
        int damage = (int) (Math.random() * 71);
        taitan.setBlood(taitan.getBlood() - damage);
        System.out.println("宙斯攻击泰坦，泰坦扣血：" + damage + "，剩余：" + taitan.getBlood());
    }
}
