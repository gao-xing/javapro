package com.neuedu.test;

public class Text_three {
    public static void main(String[] args) {
    int a=2;
    int b=5;
    int c=Text_three.square(a,b);
        System.out.println(c);
    }
    public static int square(int m,int n){
        int product=1;
        for(int i=0;i<n;i++){
            product=product*m;
        }
        return product;
    }
}
