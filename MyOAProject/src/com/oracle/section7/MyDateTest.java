package com.oracle.section7;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate today = new MyDate();
//        today.day = 4;
//        today.month = 12;
//        today.year = 2017;
        today.setDay(4);
        
        MyDate xxDay = new MyDate();
//        xxDay.day = 32;
//        xxDay.month = -13;
//        xxDay.year = -2017;
        xxDay.setDay(32);
    }
}