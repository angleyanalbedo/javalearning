package eleven;

import eleven.edu.tust.PrimerThread;

public class TestPrimeThread {
    public static void main(String[] args) {
        Thread th1 = new PrimerThread(70);
        Thread th2 = new PrimerThread(89);
        th1.start();
        th2.start();
    }
}
