package com.neuedu.test;

//选择排序
public class Select_sort {
    public static void main(String[] args) {
        int []marray={10,9,52,34,67,15,1,46,78,91,30,19};
        for(int i=0;i<marray.length-1;i++){
            for(int j=i+1;j<marray.length;j++){
                if(marray[i]>marray[j]){
                    int temp=marray[i];
                    marray[i]=marray[j];
                    marray[j]=temp;
                }
            }
        }
        for(int a:marray){
            System.out.println(a);
        }
    }
}
