package com.Tianjin.Teachlogy;

class Person{
    private String name;
    private String sex;
    private int age;
    public Person(){
        this("","",0);
    }
    public Person(String name,String sex,int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }
}
public class TestPerson {
    public static void main(String[] args) {
        Person per = new Person("wu","nan",10);
        System.out.println(per.toString());
        System.out.println(per.getAge());
        System.out.println(per.getName());
        System.out.println(per.getSex());
        per.setAge(20);
        per.setName("sda");
        per.setSex("nv");
        System.out.println(per.getAge());
        System.out.println(per.getName());
        System.out.println(per.getSex());
    }
}

