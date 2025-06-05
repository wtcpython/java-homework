package cn.campsg.java.experiment;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import cn.campsg.java.experiment.entity.Trainee;
import cn.campsg.java.experiment.entity.TraineesGroups;

public class MainClass {
    public static void main(String[] args) {
        TraineesGroups tg = new TraineesGroups();
        ArrayList<Trainee> trnList = new ArrayList<Trainee>(10);
        for (int i = 0; i < 10; i++) {
            Trainee trn = new Trainee();
            trn.setName("Trainee" + i);
            trn.setSex(i % 2 == 0 ? "male" : "female");
            trn.setHeight((float) (Math.random() * 100 + 150));
            trnList.add(trn);
        }

        tg.initTrainees(trnList);
        Map<String, List<Trainee>> group = tg.groupTrainees();

        // for (Trainee trn : group.get("male")) {
        //     System.out.println(trn);
        // }

        // System.out.println("===================================");

        // for (Trainee trn : group.get("female")) {
        //     System.out.println(trn);
        // }

        for (List<Trainee> list : group.values()) {
            System.out.println("===================================");
            for (Trainee trn : list) {
                System.out.println(trn);
            }
        }
    }
}
