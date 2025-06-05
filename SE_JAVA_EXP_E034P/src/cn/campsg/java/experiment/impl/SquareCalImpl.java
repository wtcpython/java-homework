package cn.campsg.java.experiment.impl;

import cn.campsg.java.experiment.ShapeCalc;

public class SquareCalImpl implements ShapeCalc {
    private float length;

    public SquareCalImpl() {
    }

    @Override
    public float calcPerim() {
        return length * 4;
    }

    @Override
    public float calcArea() {
        return length * length;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

}
