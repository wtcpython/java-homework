// Exercise 10.3
package com.wtc.homework;

public class MyIntegerTest {
    public static void main(String[] args) {
        MyInteger num = new MyInteger(5);
        System.out.println("num is " + num.getValue());
        System.out.println("num is even? " + num.isEven());
        System.out.println("num is odd? " + num.isOdd());
        System.out.println("num is prime? " + num.isPrime());
        if (MyInteger.isEven(num)) {
            System.out.println("num is even");
        } else {
            System.out.println("num is odd");
        }
        if (MyInteger.isPrime(num)) {
            System.out.println("num is prime");
        } else {
            System.out.println("num is not prime");
        }
        if (MyInteger.isEven(num.getValue())) {
            System.out.println("num is even");
        } else {
            System.out.println("num is odd");
        }
        if (MyInteger.isPrime(num.getValue())) {
            System.out.println("num is prime");
        } else {
            System.out.println("num is not prime");
        }
        if (num.equals(num.getValue())) {
            System.out.println("num equals " + num.getValue());
        } else {
            System.out.println("num does not equal " + num.getValue());
        }
        if (num.equals(new MyInteger(5))) {
            System.out.println("num equals 5");
        } else {
            System.out.println("num does not equal 5");
        }
    }
}
