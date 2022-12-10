package seven;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class TestDate {

    public static String transDate(String date){
        Scanner sc = new Scanner(date).useDelimiter("(\\\\|/|-)");
        StringBuffer str = new StringBuffer();
        while (sc.hasNext()){
            str.append(sc.next());
            if(sc.hasNext()) str.append("-");
        }
        SimpleDateFormat sac = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdc = new SimpleDateFormat("Gyyyy年MM月dd日, 年中第D天, 第w周,月中第F周,E");
        Date da = new Date();
        try {
            da = sac.parse(str.toString());
        }catch (ParseException e){
            e.printStackTrace();
        }
        return sdc.format(da);
    }
    public static String tranNum(int num,String pattern){
        if(pattern=="hex"){
            return Integer.toHexString(num);
        }
        if(pattern == "oct"){
            return Integer.toOctalString(num);
        }
        if(pattern=="bin"){
            return  Integer.toBinaryString(num);
        }
        return "";
    }
}
