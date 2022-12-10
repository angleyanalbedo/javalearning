package six;

import java.util.Random;

public class TestSupplier {
    public static void main(String[] args) {
        Supplier<Integer> su = new Supplier<Integer>() {
            @Override
            public Integer get() {
                Random r = new Random();
                return r.nextInt();
            }
        };
        Supplier<Integer> st = ()->{Random r = new Random(); return r.nextInt();};
        System.out.println(su.get());
        System.out.println(st.get());
    }
}
