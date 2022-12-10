package com.Tianjin.Teachlogy;
class Shape{
    public double area(){
        return 0;
    }
    public double perimter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{}";
    }
}
class Cricle extends Shape{
    private double R;

    public Cricle(double r) {
        R = r;
    }
    public Cricle(){
        this(0);
    }

    @Override
    public double area() {
        return Math.PI*R*R;
    }

    @Override
    public double perimter() {
        return 2*Math.PI*R;
    }

    @Override
    public String toString() {
        return "Cricle{" +
                "R=" + R +
                '}';
    }

    public double getR() {
        return R;
    }

    public void setR(double r) {
        R = r;
    }
}
class Rectangle extends Shape{
    private double length;
    private double wight;

    @Override
    public double area() {
        return wight*length;
    }

    public Rectangle(double length, double wight) {
        this.length = length;
        this.wight = wight;
    }
    public Rectangle(){
        this(0,0);
    }

    @Override
    public double perimter() {
        return (wight+length)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", wight=" + wight +
                '}';
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }
}
public class TestShape {

    public static void main(String[] args) {
        Cricle cr = new Cricle(5);
        System.out.println(cr.area());
        System.out.println(cr.perimter());
        Rectangle re = new Rectangle(5,9);
        System.out.println(re);
        System.out.println(re.perimter());
        Shape[] tp = new Shape[3];
        tp[0] = new Shape();
        tp[1] = cr;
        tp[2] = re;
        for(int i =0;i<3;i++){
            System.out.println(tp[i].area());
            System.out.println(tp[i].perimter());
            System.out.println(tp[i]);
        }

    }
}
