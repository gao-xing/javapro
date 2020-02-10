package com.neuedu.test;

//折半查找
public class Binary_search {
    public static void main(String[] args) {
        int []marray1={1,3,5,7,9,11,13,15,17,19,21,23};
        int x=search(marray1,11);
        if(x!=-1){
            System.out.println("在数组中的位置为第"+x+"位");
        }
        else {
            System.out.println("数组中不存在该数字");
        }
    }
    public static int search(int [] marray,int value){
        int min=0;
        int max=marray.length-1;
        int count= 0;
        while(min<=max){
            count++;
            int mid=(min+max)/2;
            if(value==marray[mid]){
                System.out.println("查找了"+count+"次");
                return mid;
            }
            else if(value<marray[mid]){
                max=mid-1;
            }
            else {
                min=mid+1;
            }
        }
        return -1;
    }
}
