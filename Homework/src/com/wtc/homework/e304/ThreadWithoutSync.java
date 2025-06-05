package com.wtc.homework.e304;

public class ThreadWithoutSync {
    private static int COUNT = 1000;

    private static void testWithoutSync() {
        IntegerWrapper wrapper = new IntegerWrapper(0);

        for (int i = 0; i < COUNT; i++) {
            new Thread(() -> {
                wrapper.increment();
            }).start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("无同步：" + wrapper.getValue());
    }

    public static void main(String[] args) {
        testWithoutSync();
    }
}
