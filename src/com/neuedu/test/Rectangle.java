package com.neuedu.test;

public class Rectangle extends Shape{
    public int wid;
    public int height;

    @Override
    public double getArea(){
        return wid*height;
    }

    @Override
    public double getPer() {
        return (wid+height)*2;
    }

    @Override
    public void showAll() {
        System.out.println(wid);
        System.out.println(height);
        System.out.println(color);
        System.out.println(getArea());
        System.out.println(getPer());
    }
    public Rectangle(){

    }
    public Rectangle(int height,int wid, String color){
        this.height=height;
        this.wid=wid;
        this.color=color;
    }
}
