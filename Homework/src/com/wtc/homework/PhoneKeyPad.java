package com.wtc.homework;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        System.err.print("Enter a letter: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        if (s.length() == 1) {
            char c = s.toLowerCase().charAt(0);
            if (c >= 'a' && c <= 'c') {
                System.out.println("The corresponding number is 2");
            } else if (c >= 'd' && c <= 'f') {
                System.out.println("The corresponding number is 3");
            } else if (c >= 'g' && c <= 'i') {
                System.out.println("The corresponding number is 4");
            } else if (c >= 'j' && c <= 'l') {
                System.out.println("The corresponding number is 5");
            } else if (c >= 'm' && c <= 'o') {
                System.out.println("The corresponding number is 6");
            } else if (c >= 'p' && c <= 's') {
                System.out.println("The corresponding number is 7");
            } else if (c >= 't' && c <= 'v') {
                System.out.println("The corresponding number is 8");
            } else if (c >= 'w' && c <= 'z') {
                System.out.println("The corresponding number is 9");
            } else {
                System.out.println(s + " is a invalid input");
            }
        } else {
            System.out.println(s + " is a invalid input");
        }
    }
}
