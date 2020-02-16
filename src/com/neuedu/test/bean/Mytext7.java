package com.neuedu.test.bean;

import com.neuedu.test.Text_five;

/**
 * Created by 高星 on 2020/2/16.
 */
public class Mytext7{
    public static void main(String[] args) {
        int a=3;
        int b=1;
        int c= Text_five.max_approximate(a,b);
        int d=Text_five.min_multiple(a,b);
        System.out.println("最大公约数为："+c);
        System.out.println("最小公倍数为："+d);
    }
    public static int max_approximate(int m,int n){
        int min =0;
        int max_approximate=0;
        if(m>n){
            min=n;
        }
        else{
            min=m;
        }
        for(int i=1;i<=min;i++){
            if(m%i==0){
                if(n%i==0){
                    max_approximate=i;
                }
            }

        }
        return max_approximate;
    }
    public static int min_multiple(int m,int n){
        int max=0;
        int min=0;
        int min_multiple=0;
        if(m>n){
            max=m;
            min=n;
        }
        else{
            max=n;
            min=m;
        }
        for(int i=1;i<=min;i++){
            min_multiple=max*i;
            if(min_multiple%min==0){
                break;
            }
        }
        return min_multiple ;
    }
}
