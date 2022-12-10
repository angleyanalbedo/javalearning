package com.harmyos;
interface Bird{
    void play();
}
interface Fish{
    default void play(){
        System.out.println("Fisk");
    }
}
public class DefaultAbstract implements Fish,Bird{
    public void play(){
        System.out.println("方法已经被重写");
    }
}
