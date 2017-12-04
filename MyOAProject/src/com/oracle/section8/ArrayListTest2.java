package com.oracle.section8;

import java.util.ArrayList;

public class ArrayListTest2 {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>();
        // auto boxing --- JDK 1.5
        x.add(10);  // ---> x.add(new Integer(10));
        x.add(20);
        
//        Integer y = 100;
//        int w = new Integer(10);
        for (int i = 0; i < 10; i++); {
            System.out.println("Hello");
        }
    }
}
