package com.neuedu.test;

public class Dog extends Animal{
    private int no;
    private String sex;
    public void setAge(int age){
        if(age<0||age>130){
            System.out.println("年龄输入有误");
            this.age=1;
        }
        else{
            this.age = age ;
        }
    }
    public int getAge(){
        return age;
    }
    public void setSex(String sex){
        if(sex!="公"&&sex!="母"){
            System.out.println("性别输入错误");
        }
        else{
            this.sex=sex;
        }
    }
    public String getSex(){
        return sex;
    }
}
