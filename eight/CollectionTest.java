package eight;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        Map<String,String> mp = new HashMap<>();
        List<Map<String,String>> list = new ArrayList<>();
        String[] key = {"Tno","Tname","Tsex","Department"};
        String[][] values = {{"T001","石云但","女","计算机系"},{"T002","罗梨","女","计算机系"},{"T003","王富强","男","数学系"}};
        for (int i =0;i<3;i++){
           for (int j = 0;j<4;j++){
               mp.put(key[j],values[i][j]);
           }
           list.add(new HashMap<>(mp));
        }
        Set<String> se = null;
        Collection<String> value = null;
        Iterator<Map<String,String>> it = list.iterator();
        String fi = "       ";
        for (String s:key) {
            fi = fi+s+"     ";
        }
        System.out.println(fi);
        while (it.hasNext()){
            mp = it.next();
            String line = "values: ";
            for (String s:key) {
                //line = line+" key:" +s+" values: "+mp.get(s);
                line = line+mp.get(s)+"     ";
            }
            System.out.println(line);
        }

    }
}
