package com.neuedu.test;

public class Text_ColaEmployee {
    public static void main(String[] args) {
    SalariedEmployee s1=new SalariedEmployee(3000);
    HourlyEmployee h1=new HourlyEmployee(80,200);
    SalesEmployee s2 =new SalesEmployee(200,2.3);
    ColaEmployee [] array={s1,h1,s2};
    for (int i=0;i<3;i++){
        System.out.println(Text_ColaEmployee.payWage(array[i],6));
    }
    }
    public static double payWage(ColaEmployee emp,int month){
        return emp.getSalary(month);
    }
}
