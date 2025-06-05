package cn.campsg.java.experiment;

public class MainClass {
    public static void main(String[] args) {
        Student stu1 = new Student("黄世仁", Student.Sex.MALE);
        Student stu2 = new Student("李紫萱", Student.Sex.FEMALE);

        System.out.println("姓名：" + stu1.getName() + "的性别是：" + stu1.getSex().value());
        System.out.println("姓名：" + stu2.getName() + "的性别是：" + stu2.getSex().value());
    }
}
