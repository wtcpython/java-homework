// Exercise 10.3
package com.wtc.homework;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public boolean isPrime() {
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int value) {
        return new MyInteger(value).isEven();
    }

    public static boolean isOdd(int value) {
        return new MyInteger(value).isOdd();
    }

    public static boolean isPrime(int value) {
        return new MyInteger(value).isPrime();
    }

    public static boolean isEven(MyInteger myInteger) {
        return myInteger.isEven();
    }

    public static boolean isOdd(MyInteger myInteger) {
        return myInteger.isOdd();
    }

    public static boolean isPrime(MyInteger myInteger) {
        return myInteger.isPrime();
    }

    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInteger myInteger) {
        return this.value == myInteger.value;
    }

    public int parseInt(char[] chars) {
        int result = 0;
        for (char c : chars) {
            result = result * 10 + (c - '0');
        }
        return result;
    }

    public int parseInt(String str) {
        return parseInt(str.toCharArray());
    }
}
