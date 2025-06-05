// Exercise 13.6
package com.wtc.homework.e135;

public class Test {
    public static void main(String[] args) {
        ComparableCircle circle1 = new ComparableCircle(5.5);
        ComparableCircle circle2 = new ComparableCircle(6.6);
        System.out.println(circle1.compareTo(circle2));
    }
}
