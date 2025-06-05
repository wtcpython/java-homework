package cn.campsg.java.experiment;

import java.util.Scanner;

public class BankQuery {
    public static void main(String[] args) {
        double money = 8888;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的姓名：");
        String name = sc.next();
        System.out.println("尊敬的客户：" + name);
        System.out.println("您的余额为：" + money);
        sc.close(); 
    }
}
