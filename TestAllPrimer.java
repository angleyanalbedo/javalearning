import edu.tust.*;
public class TestAllPrimer {

    public static void main(String[] args) {
        Thread th = new PrimeGenerator();
        th.start();
        try {
            //Thread.sleep(1000);
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        th.interrupt();

    }
}
