package cn.campsg.java.experiment;

public class MainClass {
    public static void main(String[] args) {
        int[] ages = getAges();
        int count = getAdultCount(ages);
        System.out.println("200个用户中，共有" + count + "个成年人");
    }

    public static int[] getAges() {
        int[] ages = new int[200];
        for (int i = 0; i < ages.length; i++) {
            int age = (int) (Math.random() * 61);
            ages[i] = age;
        }

        return ages;
    }

    public static int getAdultCount(int[] ages) {
        int adult = 0;
        for (int i : ages) {
            if (i >= 18) {
                adult++;
            }
        }
        return adult;
    }
}
