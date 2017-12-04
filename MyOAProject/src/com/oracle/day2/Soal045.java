package com.oracle.day2;

import java.util.ArrayList;

public class Soal045 {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        String [] myArray;
        try {
            while(true) {
                myList.add("My String");
            }
        } catch (RuntimeException e) {
            System.out.println("Caught a RuntimeException");
        } catch (Exception e) {
            System.out.println("Caught an Exception");
        }
        System.out.println("Ready to use");
    }
}
