package cn.campsg.java.experiment.entity;

public class Bank {
    private long balance = 1000L;

    public Bank() {
    }

    public void withDraw(long cash) throws InterruptedException {
        if (cash > balance) {
            throw new InterruptedException("余额不足，取款失败！");
        } else {
            balance -= cash;
            System.out.println("您的取款额为：" + cash + "；账户余额为：" + balance);
        }
    }
}
