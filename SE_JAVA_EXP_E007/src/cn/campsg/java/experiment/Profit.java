package cn.campsg.java.experiment;

import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        System.out.println("请输入利润值：");
        Scanner sc = new Scanner(System.in);
        int profit = sc.nextInt();
        double award;
        if (profit <= 10000) {
            award = 0.05 * profit;
        } else if (profit <= 100000) {
            award = 0.03 * profit;
        } else if (profit <= 1000000) {
            award = 0.02 * profit;
        } else {
            award = 0.01 * profit;
        }

        sc.close();
        System.out.println("奖金数量是：" + award);
    }
}
