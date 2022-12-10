package com.Tianjin.Teachlogy;
class Point{
    private double x_point;
    private double y_point;

    @Override
    public String toString() {
        return "Point{" +
                "x_point=" + x_point +
                ", y_point=" + y_point +
                '}';
    }

    public double getX_point() {
        return x_point;
    }

    public void setX_point(double x_point) {
        this.x_point = x_point;
    }

    public double getY_point() {
        return y_point;
    }

    public void setY_point(double y_point) {
        this.y_point = y_point;
    }
    public Point(){
        this(0,0);
    }
    public  Point( double x,double y){
        x_point = x;
        y_point = y;
    }
    public double Distance(Point p){
        return Math.sqrt(Math.pow(x_point-p.x_point,2)+Math.pow(y_point-p.y_point,2));
    }

}
public class TestPoint {
    public static void main(String[] args) {
        Point xp = new Point(7,3);
        Point yp = new Point(9,8);
        System.out.println(xp.Distance(yp));
    }
}
