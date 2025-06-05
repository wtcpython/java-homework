package cn.campsg.java.experiment;

public class Utils {
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double substract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        if (num2 == 0) {
            return -1;
        }
        return num1 / num2;
    }
}
