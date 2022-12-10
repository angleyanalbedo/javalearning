package ten;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            PrintStream pr = new PrintStream("b.txt");
            System.out.println("开始输入");
            int i = 0;
            double d =0;
            boolean b = true;
            String str = "";
            while (true) {

                if (sc.hasNextInt()) {
                    i = sc.nextInt();
                }
                if (sc.hasNextDouble()) {
                     d = sc.nextDouble();
                }
                if (sc.hasNextBoolean()) {
                     b = sc.nextBoolean();
                }
                if (sc.hasNext()) {

                    str = sc.next();
                    if(str.equalsIgnoreCase("exit"))
                        break;
                }
                pr.printf("%10s%10d%15.3f%15s",b,i,d,str);

            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        sc.close();
        sc = new Scanner("b.txt");
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }

    }
}
