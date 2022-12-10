package com.baidu;

public class BankAcount {
    private int restMoney;

    public BankAcount(int restMoney) {
        this.restMoney = restMoney;
    }
    public synchronized boolean getMoney(int money){

        if(restMoney-money>0){
            restMoney = restMoney -money;
            System.out.println(Thread.currentThread().getName()+"取出10元");
            return true;
        }else {
            System.out.println("余额不足");
            return false;
        }

    }
    public synchronized void saveMoney(int money){
        restMoney = restMoney + money;
        System.out.println("存入了"+money);
    }

    public BankAcount(){
        this(0);
    }

}
