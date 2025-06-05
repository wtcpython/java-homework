package com.wtc.homework;

import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {
        System.out.print("Enter 10 numbers: ");
        double[] array = new double[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            double val = sc.nextDouble();
            array[i] = val;
        }
        sc.close();

        double minNumber = min(array);
        System.out.println("The minimum number is " + minNumber);

    }

    public static double min(double[] array) {
        double num = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < num) {
                num = array[i];
            }
        }
        return num;
    }
}
