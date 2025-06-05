package cn.campsg.java.experiment.impl;

import cn.campsg.java.experiment.SeekJob;

public class SoftwareSeeker implements SeekJob {
    private String name;
    private float[] scores = null;

    public SoftwareSeeker() {
    }

    public SoftwareSeeker(String name, float[] scores) {
        this.name = name;
        this.scores = scores;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getSeekerAverage() {
        float average = scores[0] * 0.6f + scores[1] * 0.4f;
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
