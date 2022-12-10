package seven;

import java.util.Scanner;

public class Two {
    public  static void Two(){
        Scanner sc = new Scanner(System.in);
        int iNUm = 0;
        double dNum = 0;
        boolean flag = true;
        StringBuffer intStr = new StringBuffer();
        StringBuffer doubleStr = new StringBuffer();
        StringBuffer boolStr = new StringBuffer();

        while(true){

            if(sc.hasNextBoolean()){
                boolStr.append(sc.nextBoolean());
            } else if (sc.hasNextDouble()) {
                doubleStr.append(sc.nextDouble());
            } else if (sc.hasNextInt()) {
                intStr.append(sc.nextInt());
            }else {
                if(sc.next().equalsIgnoreCase("exit")) break;;
            }
        }
        System.out.println(intStr);
        System.out.println(doubleStr);
        System.out.println(boolStr);

    }
}
