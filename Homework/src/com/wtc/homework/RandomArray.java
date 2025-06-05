// Exercise 12.3
package com.wtc.homework;

import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        try {
            System.out.println("The element is " + array[number]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        }

        sc.close();
    }
}
