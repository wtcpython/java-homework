package cn.campsg.java.experiment.entity;

public class Postman {
    private String postName;
    private int mailCount;

    public Postman() {
    }

    public Postman(String postName, int mailCount) {
        this.postName = postName;
        this.mailCount = mailCount;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public int getMailCount() {
        return mailCount;
    }

    public void setMailCount(int mailCount) {
        this.mailCount = mailCount;
    }
}
