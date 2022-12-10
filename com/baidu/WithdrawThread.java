package com.baidu;

public class WithdrawThread extends Thread{
    private BankAcount ba;
    @Override
    public void run() {
        while(ba.getMoney(10)){

            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public WithdrawThread(){
        super();
        this.ba = new BankAcount();
    }
    public WithdrawThread(String name,BankAcount ba){
        super(name);
        this.ba = ba;

    }
}
