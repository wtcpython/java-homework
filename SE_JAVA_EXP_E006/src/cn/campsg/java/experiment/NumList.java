package cn.campsg.java.experiment;

import java.util.Scanner;

public class NumList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第1个数值：");
        int num1 = sc.nextInt();
        System.out.println("请输入第2个数值：");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " " + num2);
        } else {
            System.out.println(num2 + " " + num1);
        }
        sc.close();
    }
}
