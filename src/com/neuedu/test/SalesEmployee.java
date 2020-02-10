package com.neuedu.test;

public class SalesEmployee extends ColaEmployee{
    public int month_sellnumber;
    public double royalty_rate;
    public SalesEmployee(int month_sellnumber,double royalty_rate){
        this.month_sellnumber=month_sellnumber;
        this.royalty_rate=royalty_rate;
    }
    @Override
    public double getSalary(int month) {
        return month_sellnumber*royalty_rate;
    }
}
