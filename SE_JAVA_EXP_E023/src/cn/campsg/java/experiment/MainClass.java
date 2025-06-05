package cn.campsg.java.experiment;

public class MainClass {
    public static void main(String[] args) {
        Score score = new Score(60.0f, 70.0f);
        Student stu = new Student("黄世仁", score);
        System.out.println(stu.getName() + "的实验成绩：" + stu.getScore().getExperiment() + "，项目成绩：" + stu.getScore().getProject());
    }
}
