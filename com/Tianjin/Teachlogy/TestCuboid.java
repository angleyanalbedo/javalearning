package com.Tianjin.Teachlogy;
class Cuboi{
    private double height;
    private double wight;
    private double length;
    public Cuboi() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Cuboi(double height, double wight, double length){
        this.height =  height;
        this.wight  =  wight;
        this.length =  height;

    }
    public double Cricle(){
        return (height=wight+length)*2;
    }
    public double Volume(){
        return height*wight*length;
    }
}
public class TestCuboid {
    public static void main(String[] args) {

        Cuboi cu = new Cuboi(10,10,10);
        System.out.println(cu.Cricle());
        System.out.println(cu.Volume());
    }
}
