package cn.campsg.java.experiment;

import cn.campsg.java.experiment.impl.SquareCalImpl;

public class MainClass {
    public static void main(String[] args) {
        SquareCalImpl sc = new SquareCalImpl();
        sc.setLength(5.0f);
        System.out.println("正方形的周长为：" + sc.calcPerim());
        System.out.println("正方形的面积为：" + sc.calcArea());
    }
}
