package eight;
import eight.com.entity.Student;

import java.util.*;

public class HashSetTest {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        set.add(new Student("li",10,"nan"));
        set.add(new Student("er",32,"nv"));
        Iterator<Student> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
