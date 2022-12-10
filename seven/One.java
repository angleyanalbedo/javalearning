package seven;

import java.util.Scanner;

public class One {
    public static void one(){
        int letterNUm = 0;
        int digitalNum = 0;
        int whiteNum = 0;
        Scanner sc = new Scanner(System.in).useDelimiter("exit|EXIT");
        System.out.println("输入一行字符串 我们即将统计其中的数字个数 空格字符 字母字符的个数");
        String str = sc.next();
        sc.close();
        for(int i = 0;i<str.length();++i){
            if(Character.isDigit(str.charAt(i))){
                digitalNum++;
            } else if (Character.isLetter(str.charAt(i))) {
                letterNUm++;
            }else if(Character.isWhitespace(str.charAt(i))){
                whiteNum++;
            }
        }
        System.out.println("字母的个数是"+letterNUm);
        System.out.println("数字的个数是"+digitalNum);
        System.out.println("空格的的个数是"+whiteNum);

    }
}
