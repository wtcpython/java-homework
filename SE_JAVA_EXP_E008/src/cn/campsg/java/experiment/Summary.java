package cn.campsg.java.experiment;

public class Summary {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        System.out.println("1到100的和为：" + sum);
    }
}
