package cn.campsg.java.experiment;

import java.util.Scanner;

public class RabbitNum {
    public static void main(String[] args) {
        System.out.println("请输入兔子繁殖的月份：");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        System.out.println("第" + month + "个月，兔子数量是：" + rabbit(month));
        sc.close();
    }

    public static int rabbit(int month) {
        int rabbitNum1 = 2;
        int rabbitNum2 = 2;
        for (int i = 2; i < month; i++) {
            rabbitNum2 = rabbitNum1 + rabbitNum2;
            rabbitNum1 = rabbitNum2 - rabbitNum1;
        }
        return rabbitNum2;
    }
}
