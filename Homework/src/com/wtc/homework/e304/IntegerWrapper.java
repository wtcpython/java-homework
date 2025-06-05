package com.wtc.homework.e304;

public class IntegerWrapper {
    private int value;

    public IntegerWrapper(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void increment() {
        value++;
    }

    public synchronized void incrementSynchronized() {
        value++;
    }
}
