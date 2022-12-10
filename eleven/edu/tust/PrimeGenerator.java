package eleven.edu.tust;

public class PrimeGenerator extends Thread{
    private long maxNum = Long.MAX_VALUE;
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
//            if(isInterrupted()){
//                return;
//            }
//            try{
//                Thread.sleep(600);
//            }catch (InterruptedException e){
//                return;
//            }
            if(interrupted()){
                return;
            }
        }
        System.out.println(th.getName()+"结束");
    }
    public PrimeGenerator(){

    }
}
