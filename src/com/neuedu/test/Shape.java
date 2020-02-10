package com.neuedu.test;

public abstract class Shape {
    public int area;
    public int per;
    public String color;
    public Shape(){

    }
    public Shape(String color){
        this.color= color;
    }
    public abstract double getArea();
    public abstract double getPer();
    public abstract void showAll();

}
