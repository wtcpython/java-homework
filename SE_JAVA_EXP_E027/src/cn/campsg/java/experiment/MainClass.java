package cn.campsg.java.experiment;

import cn.campsg.java.experiment.entity.Taitan;
import cn.campsg.java.experiment.entity.Zeus;

public class MainClass {
    public static void main(String[] args) {
        Zeus zeus = new Zeus();
        Taitan taitan = new Taitan();
        attack(zeus, taitan);
    }

    public static void attack(Zeus zeus, Taitan taitan) {
        do {
            zeus.attack(taitan);
            if (taitan.getBlood() <= 0) {
                System.out.println("泰坦死亡，宙斯获胜");
                break;
            }
            taitan.attack(zeus);
            if (zeus.getBlood() <= 0) {
                System.out.println("宙斯死亡，泰坦获胜");
                break;
            }
        } while (zeus.getBlood() > 0 && taitan.getBlood() > 0);
    }
}
