package cn.campsg.java.experiment;

import java.util.Scanner;

public class AppearTime {
    public static void main(String[] args) {
        System.out.println("请输入需要验证的字符串：");
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String str = sc.nextLine();
        for (int i = 0; i < str.length() - 1; i++) {
            String s = str.substring(i, i + 2);
            if ("sh".equals(s)) {
                count++;
            }
        }
        System.out.println("sh在字符串中一共出现了" + count + "次");
        sc.close();
    }
}
