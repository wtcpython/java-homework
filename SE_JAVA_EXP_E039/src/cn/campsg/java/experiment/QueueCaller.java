package cn.campsg.java.experiment;

import java.util.ArrayList;

public class QueueCaller {
    private ArrayList<String> queue;

    public QueueCaller() {
        queue = new ArrayList<>();
    }

    public int size() {
        return queue.size();
    }

    public void fetchNumber(String patient) {
        queue.add(patient);
        System.out.println(patient + "前面还有 " + (size() - 1) + " 位在等候就诊。");
    }

    public void showPatients() {
        if (queue.size() <= 0) {
            return;
        }

        for (String patient : queue) {
            System.out.println(patient + "候诊中");
        }
    }

    public void callNumber() {
        String patient = queue.remove(0);
        System.out.println("请患者：" + patient + " 到诊室就诊！");
    }
}
