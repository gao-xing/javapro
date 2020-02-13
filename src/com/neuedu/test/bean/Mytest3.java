package com.neuedu.test.bean;

/**
 * Created by 高星 on 2020/2/13.
 */
public class Mytest3{
    public static void main(String[] args) {
        System.out.println (method (4));

    }
    public static int method(int n){
        if (n==1||n==2){
            return 1;
        }else {
            int f1=1;
            int f2=1;
            int sum;
            for (int i=3;i<=n;i++){
                sum=f1+f2;
                f1=f2;
                f2=sum;
            }
            return f2;
        }
    }


}
