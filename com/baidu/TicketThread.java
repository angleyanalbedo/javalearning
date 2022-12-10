package com.baidu;

public class TicketThread extends Thread{
    private int count;
    private int saleTicket;
    @Override
    public  void run() {

        while(count>0){
            System.out.println(Thread.currentThread().getName()+"卖出票号"+saleTicket);
            synchronized (this) {
                count = count - 1;
                saleTicket = saleTicket + 1;
            }
            try{
                Thread.sleep(1000);

            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public TicketThread(){

    }
    public TicketThread(int count){
        this.count = count;
        this.saleTicket = 0;
    }
}
