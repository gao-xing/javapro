package com.neuedu.test;

public class Text_array_copy {
    public static void main(String[] args) {
        Array_copy a1=new Array_copy();
        for(int i=1;i<=100;i++){
            a1.add(i);
        }
        System.out.println(a1.getSize());
        for(int j=0;j<a1.getSize();j++){
            System.out.println(a1.array[j]);

        }
    }
}
