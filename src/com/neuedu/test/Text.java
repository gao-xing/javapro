package com.neuedu.test;

public class Text {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.setAge(1000);

        System.out.println(d1.getAge());
        System.out.println(d1.getSex());
        Text t1 = new Text();
         t1.years(2020);
         int x= t1.sum();
         int y = Prime();
         int count=0;
        System.out.println(y);
        System.out.println(x);
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                for(int k=1;k<=4;k++){
                    System.out.println(i*100+j*10+k);
                    count++;
                }

            }
        }

        System.out.println(count);
    }
    public void years(int year){
        if((year%4==0&&year%100!=0)||year%400==0){
            System.out.println("是闰年");
        }
        else{
            System.out.println("不是闰年");
        }
    }
    public int sum(){

        int sum=0;
        for(int i=1;i<=100;i++){
            sum = sum+i;
        }
        return sum;
    }
    public static int Prime() {
        int sum = 0;
        for (int i = 2; i <= 100; i++) {
            boolean flag = true;
            for (int j = 2; j <= (int) Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
