package com.neuedu.test;

//冒泡排序
public class Bubble_sort {
    public static void main(String[] args) {
        int []marray={10,9,52,34,67,15,1,46,78,91,30,19};
        for(int i=0;i<marray.length-1;i++){
            int flag=0;
            for(int j=0;j<marray.length-i-1;j++){
                if(marray[j]>marray[j+1]){
                    int temp=marray[j];
                    marray[j]=marray[j+1];
                    marray[j+1]=temp;
                    flag++;
                }
            }
            if(flag==0){
                break;
            }
        }
        for(int a:marray){
            System.out.println(a);
        }
    }
}

