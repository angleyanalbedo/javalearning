package ninth;
import java.io.*;
class Common{
    public static void withoutResource(){
        File filesource = new File("src/a.java");
        File filedest = new File("src/FinallTry.java");
        FileInputStream filein = null;
        FileOutputStream fileout = null;
        if (!(filedest.exists()) && filesource.exists()) {
            System.out.println("文件不存在");
            return;
        }

        try {
            int len = (int) filesource.length();
            byte[] b = new byte[len];
            filein = new FileInputStream(filesource);
            fileout = new FileOutputStream(filedest);
            filein.read(b);
            System.out.println(new String(b));
            fileout.write(b);


        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try {
                filein.close();
                fileout.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public static void  withResource(){
        File filesource = new File("src/a.java");
        File filedest = new File("src/tmp.jaa");

        if (!(filedest.exists()) && filesource.exists()) {
            System.out.println("文件不存在");
            return;
        }

        try (FileInputStream filein = new FileInputStream(filesource);
             FileOutputStream fileout = new FileOutputStream(filedest);){
            int len = (int) filesource.length();
            byte[] b = new byte[len];
            filein.read(b);
            System.out.println(new String(b));
            fileout.write(b);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class Two {
    public static void main(String[] args) {
        Common.withResource();
    }
}
