package cn.campsg.java.experiment.entity;

public class Consumer implements Runnable {
    private SharePool pool;

    public Consumer() {
    }

    public Consumer(SharePool pool) {
        this.pool = pool;
    }

    @Override
    public void run() {
        int counter = 0;
        while (true) {
            counter++;
            if (counter > 15) {
                System.out.println("本线程完成订阅处理量，即刻退出。处理者@" + Thread.currentThread().getName());
                break;
            }
            System.out.println("处理者@" + Thread.currentThread().getName() + ":处理第 " + counter + "份订阅。");
            this.pool.consume();
        }
    }
}
