package cn.campsg.java.experiment;

public class Student {

    private String name;
    private int age;
    private boolean sex;
    private float score;

    public Student() {
        name = "";
        age = 0;
        sex = true;
        score = 0.0f;
    }

    public Student(String name, int age, boolean sex, float score) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18) {
            age = 18;
        }
        this.age = age;
    }

    public String getSex() {
        return sex ? "男" : "女";
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
}
