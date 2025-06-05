package cn.campsg.java.experiment.entity;

import java.util.Date;

public abstract class Builder {
    public abstract boolean buildBase(Date endDate);

    public abstract void buildBody();

    public void construct(Date endDate) {
        if (buildBase(endDate)) {
            buildBody();
        }
    }
}
