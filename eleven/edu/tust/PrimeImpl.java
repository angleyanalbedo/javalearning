package eleven.edu.tust;

public class PrimeImpl implements Runnable {
    private int maxNum;
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
    boolean isPrime(int num){
        for(int i = 2;i<num;++i){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public PrimeImpl(int maxNum) {
        this.maxNum = maxNum;
    }
    public PrimeImpl(){
        this(0);
    }

}
