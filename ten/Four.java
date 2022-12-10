package ten;

import java.io.*;

public class Four {
    public static void main(String[] args) {
        //InputStreamReader ins = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        //OutputStreamWriter osw = null;
        String str = null;
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
            bw.write(" 输入开始\n");
            bw.flush();
            while((str = br.readLine())!=null){
                bw.write(str);
                bw.write("输入是\n");
                bw.flush();
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {

        }
        try{
            bw.close();
            br.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
