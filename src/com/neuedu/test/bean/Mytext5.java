package com.neuedu.test.bean;

/**
 * Created by 高星 on 2020/2/16.
 */
public class Mytext5{
    public static void main(String[] args) {
        int year=1900;
        if (year%4==0&&year%100!=0&&year%400==0){
            System.out.println ("是闰年");
        }else {
            System.out.println ("不是闰年");
        }
    }
}
