package com.oracle.day1;

public class Soal002 {
    public static void main(String[] args) {
        int aVar = 9;
        if(aVar++ < 10) {
            System.out.println(aVar + " Hello World!");
        } else {
            System.out.println(aVar + " Hello Universe!");
        }
    }
}
