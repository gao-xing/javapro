package com.neuedu.web;

import java.util.Scanner;

/**
 * Created by 高星 on 2020/2/20.
 */
public class Studentweb{
    public void showmain(){
        System.out.println ("------------------------------");
        System.out.println ("1-------------------------查询");
        System.out.println ("2-------------------------添加");
        System.out.println ("3-------------------------修改");
        System.out.println ("4-------------------------删除");
        System.out.println ("其他----------------------退出");
        System.out.println ("------------------------------");
    }
    public void input(){
        Scanner scanner=new Scanner (System.in);
        int i=scanner.nextInt ();
        if (i==1){
            System.out.println ("查询");
        }else if (i==2){
            System.out.println ("添加");
        }else if (i==3){
            System.out.println ("修改");
        }else if (i==4){
            System.out.println ("删除");
        }else {
            System.exit (0);
        }
    }
    public void query(){
        System.out.println ("调用查询方法");
    }

 }
