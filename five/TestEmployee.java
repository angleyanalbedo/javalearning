package five;

public class TestEmployee {
    public static void main(String[] args) {
        Employee oy = new Employee("a",1);
        Employee ox = new Employee("b",1);
        System.out.println(ox.compareTo(oy));
    }


}
