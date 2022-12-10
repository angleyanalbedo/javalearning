package com.Tianjin.Teachlogy;
class QuardEquation{
    private double a,b,c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public QuardEquation(){
        this(0,0,0);
    }
    public QuardEquation(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int getDiscriminant(){
        if(b*b - 4* a*c<0){
            return 0;
        }else {
            return 1;
        }
    }
    public double getFirstAnswer(){
        if(getDiscriminant() == 1){
            return (-b-Math.sqrt(b*b-4*a*c))/2*a;
        }else{
            return 9999999;
        }
    }
    public  double getSecondAnswer(){
        if(getDiscriminant()==1){
            return (-b+Math.sqrt(b*b-4*a*c))/2*a;
        }else {
            return 9999999;
        }
    }
}
public class TestQuardEquation {
    public static void main(String[] args) {
        QuardEquation qt = new QuardEquation(1,-2,1);
        System.out.println(qt.getFirstAnswer());
        System.out.println(qt.getSecondAnswer());
    }
}
