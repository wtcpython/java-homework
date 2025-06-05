package cn.campsg.java.experiment.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class TraineesGroups {
    private List<Trainee> trnList = null;
    private Map<String, List<Trainee>> groups = null;

    public void initTrainees(List<Trainee> trnList) {
        this.trnList = trnList;
    }

    public Map<String, List<Trainee>> groupTrainees() {
        if (Objects.isNull(trnList) || trnList.isEmpty()) {
            return null;
        }

        groups = new HashMap<String, List<Trainee>>();
        groups.put("male", new ArrayList<Trainee>());
        groups.put("female", new ArrayList<Trainee>());

        for (int i = 0; i < trnList.size(); i++) {
            Trainee trn = trnList.get(i);
            if (trn.getSex().equals("male")) {
                groups.get("male").add(trn);
            } else if (trn.getSex().equals("female")) {
                groups.get("female").add(trn);
            }
        }

        Collections.sort(groups.get("male"));
        Collections.sort(groups.get("female"));
        return groups;
    }
}
