package com.baidu;

public class DepositThread extends Thread{
    private BankAcount ba;
    @Override
    public void run() {
        while(true){
            ba.saveMoney(5);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public DepositThread(){
        this.ba = ba;
    }
    public DepositThread(String name,BankAcount ba){
        super(name);
        this.ba = ba;
    }
}
