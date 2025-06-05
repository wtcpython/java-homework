package cn.campsg.java.experiment;

import java.util.Scanner;

public class BankGet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入取款金额：");
        double money = 8888;
        double input = sc.nextDouble();
        if (input > money) {
            input = money;
            money = 0;
        } else if (input < 0) {
            input = 0;
        } else {
            money -= input;
        }
        System.out.println("您已成功取出：" + input);
        System.out.println("您的余额为：" + money);

        sc.close();
    }
}
