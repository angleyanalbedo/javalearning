import edu.tust.PrimeImpl;

public class TestPrime {
    public static void main(String[] args) {
        System.out.println("main线程开始");
        Runnable run = new PrimeImpl(50);
        Thread th4 = new Thread(run);
        Thread th5 = new Thread(run);
        Thread th6 = new Thread(run);
        Thread th1 = new Thread(new PrimeImpl(60));
        Thread th2 = new Thread(new PrimeImpl(60));
        Thread th3 = new Thread(new PrimeImpl(60));
        System.out.println("三个线程同一个线程实列");
        th4.setPriority(Thread.MIN_PRIORITY);
        th4.start();
        th5.setPriority(Thread.NORM_PRIORITY);
        th5.start();
        th6.setPriority(Thread.MAX_PRIORITY);
        th6.start();
        System.out.println("三个线程不同的线程实列");
        th1.setPriority(Thread.MIN_PRIORITY);
        th2.setPriority(Thread.NORM_PRIORITY);
        th3.setPriority(Thread.MAX_PRIORITY);
        th1.start();
        th2.start();
        th3.start();
        System.out.println("main线程结束");
    }
}
