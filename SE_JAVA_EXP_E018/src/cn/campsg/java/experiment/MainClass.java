package cn.campsg.java.experiment;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        System.out.println("和为：" + Utils.add(num1, num2));
        System.out.println("差为：" + Utils.substract(num1, num2));
        System.out.println("积为：" + Utils.multiply(num1, num2));
        double result = Utils.division(num1, num2);
        if (result == -1) {
            System.out.println("分母不能为0");
        } else {
            System.out.println("商为：" + result);
        }
        sc.close();
    }
}
