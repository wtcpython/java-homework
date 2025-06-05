package cn.campsg.java.experiment.entity;

public class Feeder {
    private Tiger[] tiger;

    public Feeder() {
        tiger = new Tiger[3];
        tiger[0] = new Tiger("华南虎");
        tiger[1] = new Tiger("东北虎");
        tiger[2] = new Tiger("新疆虎");
    }

    public void feed(String type) {
        for (int i = 0; i < tiger.length; i++) {
            if (type != null && tiger[i].getType().equals(type)) {
                tiger[i].eat();
            }
        }
    }

    public void feed() {
        for (int i = 0; i < tiger.length; i++) {
            feed(tiger[i].getType());
        }
    }
}
