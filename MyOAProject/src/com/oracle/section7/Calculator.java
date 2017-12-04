package com.oracle.section7;

public class Calculator {
    public static int add(String b, int ... a) {   // variable arguments
        int total = 0;
        for (int i : a) {
            total += i;
        }
        return total;
    }
//    public static int add(int a, int b, int c) {
//        return a + b + c;
//    }
    public static void main(String[] args) {
        System.out.println(add("",new int[]{4,6}));
        System.out.println(add("",1,2,3,4,5,6,7,8,9));
        System.out.println(add("",1,2,3,4,5,4,3,2,3,4,5,6,9,8,9));
    }
}