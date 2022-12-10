package cn.sohu;
interface Dog{
     default void play(){
         System.out.println("bn");
     }
}
interface Cat{
    default void play(){
        System.out.println("a");
    }
}
public class Test implements Cat,Dog{
    @Override
    public void play() {
        Cat.super.play();
    }
}
