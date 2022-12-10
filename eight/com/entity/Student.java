package eight.com.entity;

import java.util.Objects;

public class Student{
    private String name;
    private int age;
    private String sex;

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Student(){
        this("",0,"");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && name.equals(student.name) && sex.equals(student.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }
    // public int hashCode(){
     //   return (name.hashCode()+sex.hashCode())*age;
   // u }
   /* public boolean equals(Object obj){
        if(this==obj) return true;
        Student stu = (Student) obj;
        return age == stu.age&& name.equals(stu.name)&&sex.equals(stu.sex);
    }*/
}

