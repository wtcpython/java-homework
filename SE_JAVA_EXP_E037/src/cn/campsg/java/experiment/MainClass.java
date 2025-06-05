package cn.campsg.java.experiment;

import java.util.Scanner;

import cn.campsg.java.experiment.entity.Bank;

public class MainClass {
    public static void main(String[] args) {
        long cash = 0L;
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入取款金额：");
        try {
            cash = Long.parseLong(scanner.nextLine());
        } catch (NumberFormatException nfe) {
            System.out.println("输入金额不正确，请重新输入取款金额.");
            scanner.close();
            return;
        }

        Bank bank = new Bank();

        try {
            bank.withDraw(cash);
        } catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
        }
        scanner.close();
    }
}
