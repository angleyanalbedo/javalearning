package com.Tianjin.Teachlogy;

abstract class ThreeDimGraphic {
    protected double area;
    final public double PI = Math.PI;
    protected double volume;
    public abstract double getArea();
    public abstract double getVolume();
}
class Cylinder extends ThreeDimGraphic{
    private double r;
    private double high;

    public Cylinder(double r, double high) {
        this.r = r;
        this.high = high;
        this.area = 2*PI*r*r+2*PI*r*high;
        this.volume = PI*r*r*high;
    }

    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    public double getVolume() {
        return this.volume;
    }

    public Cylinder(){
        this(0,0);
        this.area =0;
        this.volume =0;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

}
class Cuboid extends ThreeDimGraphic{
    private double length;
    private double width;
    private double high;
    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    public double getVolume() {
        return this.volume;
    }

    public Cuboid(double length, double width, double high) {
        this.length = length;
        this.width = width;
        this.high = high;
        this.area = (length*width+length+high+width*high)*2;
        this.volume = length*width*high;
    }
    public Cuboid(){
        this(0,0,0);
        this.area = 0;
        this.volume = 0;
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

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }
}
public class TestThreeDimGraphic{
    public static void main(String[] args) {
        ThreeDimGraphic te = new Cylinder(4,7);
        System.out.println(te.getArea());
        System.out.println(te.getVolume());
        te = new Cuboid(1,2,5);
        System.out.println(te.getArea());
        System.out.println(te.getVolume());

    }
}
