package com.wtc.homework;

import java.util.Arrays;
import java.util.Scanner;

public class SortNumber {
    public static void main(String[] args) {
        System.out.println("Input three integers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        int[] list = { a, b, c };
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
 