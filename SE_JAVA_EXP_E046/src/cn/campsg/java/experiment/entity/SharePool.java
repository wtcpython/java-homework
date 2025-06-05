package cn.campsg.java.experiment.entity;

import java.util.ArrayList;
import java.util.List;

public class SharePool {
    private List<String> pool;
    private final int MAX = 15;

    public SharePool() {
        pool = new ArrayList<>();
    }

    public List<String> getPool() {
        return pool;
    }

    public void setPool(List<String> pool) {
        this.pool = pool;
    }

    public void produce(String media) {
        synchronized (this) {
            if (pool.size() >= MAX) {
                System.out.println("订阅请求队列已满，等待系统处理订阅请求中……");
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                pool.add(media);
                System.out.println(
                        "订阅者@" + Thread.currentThread().getName() + ":订阅《" + media + "》申请已提交.当前订阅数量为：" + pool.size());
                notify();
            }
        }
    }

    public void consume() {
        synchronized (this) {
            if (pool.size() == 0) {
                System.out.println("处理者@" + Thread.currentThread().getName() + "暂无订阅请求信息，等待中…");
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                String media = pool.remove(0);
                System.out.println(
                        "处理者@" + Thread.currentThread().getName() + ":处理《" + media + "》订阅已完毕。尚待处理订阅数量为：" + pool.size());
                notify();
            }
        }
    }
}
