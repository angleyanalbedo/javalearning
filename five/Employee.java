package five;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private String name;
    private double price;


    public Employee(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public Employee(){
        this("",0);
    }

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public int compareTo(Employee other){

        if(this.price<other.getPrice()){
            return -1;
        } else if (this.price == other.getPrice()) {
            return 0;
        }else {
            return 1;
        }
    }
}
