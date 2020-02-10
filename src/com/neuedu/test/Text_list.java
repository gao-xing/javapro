package com.neuedu.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Text_list {
    public static void main(String [] args){
        /* List:
         *  ArrayList与Vector的区别：前者非线程安全，后者线程安全；
         *  ArrayList与LinkedList的区别：前者是数组，后者是链表；
         *
         * */
        List list =new ArrayList();
        List list2=new Vector();
        List list3=new LinkedList();
        list.add(1);
        list.add("sss");
        list2.add("www");
        list.add(0,1);//在指定索引下标添加
        list.addAll(list2);
        list.contains(1);//查找元素，返回boolean类型
        list.indexOf(1);//查找元素索引
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
