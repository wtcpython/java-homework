package cn.campsg.java.experiment.impl;

import cn.campsg.java.experiment.SeekJob;

public class BigDataSeeker implements SeekJob {
    private String name;
    private float[] scores = null;

    public BigDataSeeker() {
    }

    public BigDataSeeker(String name, float[] scores) {
        this.name = name;
        this.scores = scores;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getSeekerAverage() {
        float average = (scores[0] + scores[1]) / 2;
        return average;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float[] getScores() {
        return scores;
    }

    public void setScores(float[] scores) {
        this.scores = scores;
    }

}
