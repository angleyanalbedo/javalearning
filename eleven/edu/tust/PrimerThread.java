package eleven.edu.tust;

public class PrimerThread extends Thread{
    private int maxNum;
    boolean isPrime(int num){
        for(int i = 2;i<num;++i){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    @Override
    public void run() {
        Thread th = Thread.currentThread();
        for(int i = 2;i<=maxNum;++i){
            if(isPrime(i)){
                System.out.println(th.getName()+"=>"+i);
            }
        }
        System.out.println(th.getName()+"结束");
    }
    public PrimerThread(Runnable ru, int maxNum) {
        super(ru);
        this.maxNum = maxNum;
    }
    public PrimerThread(int maxNum){
        super();
        this.maxNum = maxNum;
    }
    public PrimerThread(){
        super();
    }

}
