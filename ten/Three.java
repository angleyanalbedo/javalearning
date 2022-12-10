package ten;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try(FileOutputStream fileout = new FileOutputStream("b.txt");){
            while(sc.hasNextLine()){
                String str = sc.nextLine();
                if(str.equalsIgnoreCase("exit"))
                    break;
                fileout.write(str.getBytes(StandardCharsets.UTF_8));
            }
        }catch(IOException e){
                e.printStackTrace();
        }
    }
}
