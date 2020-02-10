package com.neuedu.test;

public class Circle extends Shape {
    public int radius;

    @Override
    public double getPer() {
        return 2*Math.PI*radius;
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public void showAll() {
        System.out.println(radius);
        System.out.println(color);
        System.out.println(getArea());
        System.out.println(getPer());

    }
    public Circle(){

    }
    public Circle(int radius,String color){
        this.radius=radius;
        this.color= color;
    }

}
