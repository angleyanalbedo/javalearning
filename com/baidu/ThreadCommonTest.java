package com.baidu;

public class ThreadCommonTest {
    public static void main(String[] args) {
        BankAcount ba = new BankAcount(1000);
        Thread th = new WithdrawThread("一",ba);
        Thread th2 = new DepositThread("二",ba);
        th.start();
        th2.start();
        String s = "a";

    }
}
