package com.neuedu.test;

public class Text_four {
    public static void main(String[] args) {
     int [] array={0,1,2,3,4,5,6,7,8,9};
        Text_three p1=new Text_three();
     for (int a : array){
         for(int b : array){
             for(int c :array)
                 if((p1.square(a,3)+p1.square(b,3)+p1.square(c,3)==a*100+b*10+c)&&(a*100+b*10+c>111)){
                     System.out.println(a*100+b*10+c);
                 }
         }
     }
    }
}
