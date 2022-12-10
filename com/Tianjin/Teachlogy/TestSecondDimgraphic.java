package com.Tianjin.Teachlogy;
interface SecondDimgraphic{
    double PI = Math.PI;
    double getArea();
    double getPerimeter();
}
class Circle implements SecondDimgraphic{
    private double r;

    @Override
    public double getArea() {
        return PI*r*r;
    }

    public Circle(double r) {
        this.r = r;
    }
    public Circle(){
        this(0);
    }

    @Override
    public double getPerimeter() {
        return 2*PI*r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
class Triangle implements SecondDimgraphic{
    private double length;
    private double width;

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return 2*(length+width);
    }

    public Triangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
public class TestSecondDimgraphic {
    public static void main(String[] args) {
        SecondDimgraphic te = new Circle(7);
        System.out.println(te.getArea());
        System.out.println(te.getPerimeter());
        te = new Triangle(4,5);
        System.out.println(te.getArea());
        System.out.println(te.getPerimeter());
    }
}
