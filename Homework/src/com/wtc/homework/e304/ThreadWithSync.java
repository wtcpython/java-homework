package com.wtc.homework.e304;

public class ThreadWithSync {
    private static int COUNT = 1000;

    private static void testWithSync() {
        IntegerWrapper wrapper = new IntegerWrapper(0);

        for (int i = 0; i < COUNT; i++) {
            new Thread(() -> {
                wrapper.incrementSynchronized();
            }).start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("有同步: " + wrapper.getValue());
    }

    public static void main(String[] args) {
        testWithSync();
    }
}
