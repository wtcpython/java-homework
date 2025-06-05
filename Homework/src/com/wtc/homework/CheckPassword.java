package com.wtc.homework;

import java.util.Scanner;

public class CheckPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.next();
        sc.close();
        if (password.length() < 8) {
            System.out.println("Invalid Password");
        } else {
            int digitCount = 0;
            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                    continue;
                } else if (c >= '0' && c <= '9') {
                    digitCount++;
                } else {
                    System.out.println("Invalid Password");
                    return;
                }
            }
            if (digitCount < 2) {
                System.out.println("Invalid Password");
            } else {
                System.out.println("Valid Password");
            }
        }
    }
}
