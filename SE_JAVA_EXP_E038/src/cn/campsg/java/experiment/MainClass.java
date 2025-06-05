package cn.campsg.java.experiment;

import java.util.Scanner;

import cn.campsg.java.experiment.exception.RoseException;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("你想送女朋友多少朵玫瑰（数字）：");
        Scanner sc = new Scanner(System.in);
        Rose rose = new Rose(100);
        try {
            int num = sc.nextInt();
            rose.giveRose(num);
        } catch (RoseException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
            System.out.println("无论如何，我都是爱你的！\n");
        }
    }
}
