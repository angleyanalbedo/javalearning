package ninth;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

class ListDirAll{

    public static void listAll(File file){
        if(!file.exists()){
            System.out.println("文件不存在");
            String filename = file.getName();
            try{
                if (filename.indexOf('.')!=-1) {
                    if (file.createNewFile())
                        System.out.println("文件创建成功");
                }else{
                    if(file.mkdir())
                        System.out.println("目录创建成功");
                }
            }catch(IOException e){
                e.printStackTrace();
            }
            return;
        }
        if(file.isDirectory()){
            File f[] = file.listFiles();
            if(f != null){
                for(File f1:f){
                    listAll(f1);

                }
            }
        }else{
            System.out.println("文件名是:"+file.getName());
            System.out.println("文件的绝对路径是:"+file.getAbsolutePath());
            System.out.println("文件的父目录是: "+file.getParent());
            System.out.println("文件的路径是: "+file.getPath());
            System.out.println("文件的长度是:"+file.length());
            System.out.println("文件最后的修改时间是:"+new Date(file.lastModified()));
        }
    }

}
public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = null;
        System.out.println("开始输入");
        while(sc.hasNext()){
            str = sc.nextLine();
            if(str.equalsIgnoreCase("exit")){
                System.out.println("输入结束");
                break;
            }
            ListDirAll.listAll(new File(str));
        }
        sc.close();
    }
}
