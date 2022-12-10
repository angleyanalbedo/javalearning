package com.Tianjin.Teachlogy;

import java.security.PublicKey;

class Plurality{
    private float real;
    private float virtual;

    public Plurality(float real, float virtual) {
        this.real = real;
        this.virtual = virtual;
    }

    public Plurality(){
        this(0,0);
    }
    public Plurality(Plurality pl){
        this(pl.getReal(),pl.getReal());
    }

    @Override
    public String toString() {
        return "Plurality{" +real +" + "+ virtual +"i}";
    }

    public float getReal() {
        return real;
    }

    public void setReal(float real) {
        this.real = real;
    }

    public float getVirtual() {
        return virtual;
    }

    public void setVirtual(float virtual) {
        this.virtual = virtual;
    }
    public Plurality add(Plurality pl){
        return new Plurality(this.real+pl.getReal(),this.virtual+pl.getVirtual());
    }
    public Plurality sub(Plurality pl){
        return new Plurality(this.real-pl.getReal(),this.virtual- pl.getVirtual());
    }
    public Plurality imp(Plurality pl){
        return new Plurality(real*pl.getReal()-virtual*pl.getVirtual(),virtual*pl.getReal()+real*pl.getVirtual());
    }
    public Plurality div(Plurality pl){
        float tmp = pl.getReal()* pl.real + pl.getVirtual()*pl.getVirtual();
        return new Plurality(real*pl.getReal()+virtual*pl.getVirtual()/tmp,
                virtual*pl.getReal()-real*pl.getVirtual()/tmp);
    }

}
public class TestPlurality {
    public static void main(String[] args) {
        Plurality x = new Plurality(1,1);
        Plurality y = new Plurality(2,3);
        System.out.println(x.add(y));
        System.out.println(x.sub(y));
        System.out.println(x.imp(y));
        System.out.println(x.div(y));
    }
}
