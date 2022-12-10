package com.baidu;

public class ThreadSynTest {
    public static void main(String[] args) {
        BankAcount ba = new BankAcount(1000);
        Thread th = new WithdrawThread("一号",ba);
        Thread th2 = new WithdrawThread("二号",ba);
        Thread th3 = new WithdrawThread("三号",ba);
        th.start();
        th2.start();
        th3.start();
    }
}
