package ten;

import java.io.*;
import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入源文件");
        String source = sc.nextLine();
        System.out.println("输入目标文件");
        String dest = sc.nextLine();
        File sf = new File(source);
        File f = new File(dest);
        if(f.exists()){
            System.out.println("目标文件存在");
        }else{
            try{
            f.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }

        }

        try (
                BufferedReader filein = new BufferedReader(new FileReader(source));
                BufferedWriter fileout = new BufferedWriter(new FileWriter(dest));){
                String str = null;
                while((str = filein.readLine())!=null){
                    fileout.write(str);
                }
                fileout.flush();

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
