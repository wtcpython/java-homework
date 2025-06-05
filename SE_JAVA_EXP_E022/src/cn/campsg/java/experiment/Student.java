package cn.campsg.java.experiment;

public class Student {
    public enum Sex {
        MALE(0), FEMALE(1);

        private int param = 0;

        private Sex(int param) {
            this.param = param;
        }

        public String value() {
            if (param == 0) {
                return "男";
            } else {
                return "女";
            }
        }
    }

    private String name;
    private Sex sex;

    public Student() {
    }

    public Student(String name, Sex sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

}
