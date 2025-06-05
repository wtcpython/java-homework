package com.wtc.homework;

public class DivisibleNumber {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i <= 1000; i++) {
            if ((i % 5 == 0) && (i % 6 == 0)) {
                count++;
                if (count % 10 == 0) {
                    System.out.print(i + System.lineSeparator());
                } else {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
