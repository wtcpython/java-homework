package cn.campsg.java.experiment;

import java.util.Scanner;

public class ComNum {
    public static void main(String[] args) {
        System.out.println("请输入阶乘求和计算的边界值：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        long sum = 0;
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            sum += factorial;
            factorial = 1;
        }

        System.out.println("1到" + num + "，各数阶乘之和为：" + sum);
    }
}
