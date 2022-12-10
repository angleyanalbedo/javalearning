package eight;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        String str;
        list.add("asd");
        while (sc.hasNext()){
            str = sc.next();
            if(str.equalsIgnoreCase("exit")){
                break;
            }else {
                list.add(str);
            }
        }
        sc.close();
        ListIterator<String> itl = list.listIterator();
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        while (itl.hasNext()){
            System.out.println(itl.next());
        }
        while (itl.hasPrevious()){
            System.out.println(itl.previous());
        }
    }

}
