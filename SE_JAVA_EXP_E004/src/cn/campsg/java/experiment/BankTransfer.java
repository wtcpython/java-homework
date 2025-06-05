package cn.campsg.java.experiment;

import java.util.Scanner;

public class BankTransfer {
    public static void main(String[] args) {
        System.out.println("请输入要转账的金额：");
        float total = 10000.00f;
        Scanner sc = new Scanner(System.in);
        float money = sc.nextFloat();
        sc.close();
        if (money < 0 || money > total) {
            System.out.println("输入的转账金额有误！");
            return;
        }
        total -= money;
        System.out.println("支出：" + money);
        System.out.println("当前余额：" + total);
    }
}
