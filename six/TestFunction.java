package six;

public class TestFunction {
    public static void main(String[] args) {
        Function<Integer,String> in = new Function<Integer, String>() {
            @Override
            public String apply(Integer argument) {
                return argument.toHexString(argument);
            }
        };
        Function<Integer,String> in2 = (Integer argument)->{return argument.toHexString(argument);};
        System.out.println(in.apply(Integer.valueOf(7)));
        System.out.println(in2.apply(Integer.valueOf(9)));
    }
}
