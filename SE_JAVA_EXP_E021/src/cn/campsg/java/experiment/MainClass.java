package cn.campsg.java.experiment;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        boolean sex = sc.nextBoolean();
        float score = sc.nextFloat();
        Student stu = new Student(name, age, sex, score);
        System.out.println(
                "姓名：" + stu.getName() + "\n" +
                        "年龄：" + stu.getAge() + "\n" +
                        "性别：" + stu.getSex() + "\n" +
                        "成绩：" + stu.getScore());
        sc.close();
    }
}
