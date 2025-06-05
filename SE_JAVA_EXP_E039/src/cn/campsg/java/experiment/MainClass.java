package cn.campsg.java.experiment;

public class MainClass {
    public static void main(String[] args) {
        QueueCaller qc = new QueueCaller();
        for (int i = 1; i <= 3; i++) {
            qc.fetchNumber("张山-" + i);
        }

        while (qc.size() != 0) {
            qc.callNumber();
            qc.showPatients();
        }
    }
}
