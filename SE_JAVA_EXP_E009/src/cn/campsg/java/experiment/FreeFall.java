package cn.campsg.java.experiment;

import java.util.Scanner;

public class FreeFall {
    public static void main(String[] args) {
        System.out.println("请输入弹跳次数：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
    
        int height = 10000;
        int i;
        for (i = 0; i < num; i ++) {
            height /= 2;
            if (height == 0) {
                System.out.println("第" + (i + 1) + "次反弹后，球体落地");
                break;
            }
        }

        if (height > 0) {
            System.out.println(i + "次反弹后，当前球体的高度是：" + height);
        }
    }
}
