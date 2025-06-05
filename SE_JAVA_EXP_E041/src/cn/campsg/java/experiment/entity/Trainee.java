package cn.campsg.java.experiment.entity;

public class Trainee implements Comparable<Trainee> {

    private String name;
    private String sex;
    private float height;

    public Trainee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public int compareTo(Trainee anthor) {
        return Float.compare(this.height, anthor.height);
    }

    @Override
    public String toString() {
        return "Trainee [name=" + name + ", sex=" + sex + ", height=" + height + "]";
    }

}
