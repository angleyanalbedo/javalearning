package six;

public class TestCalculator {
    public static void main(String[] args) {
        Calcalator ca = new Calcalator() {
            @Override
            public double calculate(int a, int b) {
                return a*a+b*b;
            }
        };
        Calcalator cr = (int a,int b)->{return a*a+b*b;};
        System.out.println(ca.calculate(1,2));
        System.out.println(cr.calculate(2,4));

    }
}
