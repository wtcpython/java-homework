package cn.campsg.java.experiment;

import java.util.Scanner;

public class DaffodilsNum {
    public static void main(String[] args) {
        System.out.println("请输入0-1000内的数字：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        if (num < 0 || num > 1000) {
            System.out.println("输入的不是0-1000内的数字！");
        } else {
            int ge = num % 10;
            int shi = num / 10 % 10;
            int bai = num / 100;
            int sum = (int) (Math.pow(ge, 3)) + (int) (Math.pow(shi, 3)) + (int) (Math.pow(bai, 3));
            if (sum == num) {
                System.out.println("是水仙花数！");
            } else {
                System.out.println("不是水仙花数！");
            }
        }
    }
}
