package five;

import java.util.List;

class Point{
    private double x_point;
    private double y_point;

    @Override
    public String toString() {
        return "five.Point{" +
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
class Shape{
    public double area(){
        return 0;
    }
    public double perimter(){
        return 0;
    }

    @Override
    public String toString() {
        return "five.Shape{}";
    }
}
class Cricle extends Shape {
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
        return "five.Cricle{" +
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
public class GenericBoxTest{
    public static void printDatas(Box<?> a){
        System.out.println(a.getData());

    }

    public static void main(String[] args) {
        Box<String> bs  = new Box<String>("qwewq");
        Box<Point> bp = new Box<Point>(new Point(1,2));
        Box<Cricle> bc = new Box<Cricle>(new Cricle(3));
        Box<?> a;

        GenericBoxTest.printDatas(bp);
        GenericBoxTest.printDatas(bs);
        GenericBoxTest.printDatas(bc);
    }
}
