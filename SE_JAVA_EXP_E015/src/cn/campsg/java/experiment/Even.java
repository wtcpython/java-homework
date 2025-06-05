package cn.campsg.java.experiment;

import java.util.Scanner;
import java.util.StringJoiner;

public class Even {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int index = 0;
        Scanner sc = new Scanner(System.in);
        while (index < arr.length) {
            System.out.println("请输入第" + (index + 1) + "个数字，并回车：");
            int num = sc.nextInt();
            arr[index++] = num;
        }
        sc.close();
        StringJoiner sj = new StringJoiner(" ");
        int i = 0;
        while (i < arr.length) {
            if (arr[i] % 2 == 0) {
                sj.add(String.valueOf(arr[i]));
            }
            i++;
        }

        System.out.println("输入的数字中为偶数的是：" + sj);
    }
}
