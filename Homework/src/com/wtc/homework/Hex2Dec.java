// Exercise 12.6
package com.wtc.homework;

public class Hex2Dec {
    public static void main(String[] args) {
        System.out.println(hex2Dec("A5"));
        System.out.println(hex2Dec("1A"));
        System.out.println(hex2Dec("FSR"));
        System.out.println(hex2Dec("TAA"));
    }

    public static int hex2Dec(String hex) {
        int value = 0;
        for (char c : hex.toCharArray()) {
            value = value * 16 + hex2Dec(c);
        }
        return value;
    }

    public static int hex2Dec(char ch) {
        if (ch == 'A') {
            return 10;
        } else if (ch == 'B') {
            return 11;
        } else if (ch == 'C') {
            return 12;
        } else if (ch == 'D') {
            return 13;
        } else if (ch == 'E') {
            return 14;
        } else if (ch == 'F') {
            return 15;
        } else if (ch <= '9' && ch >= '0')
            return ch - '0';
        else {
            throw new NumberFormatException("character error: " + ch);
        }
    }
}
