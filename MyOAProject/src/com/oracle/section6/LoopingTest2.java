package com.oracle.section6;

public class LoopingTest2 {
    public static void main(String[] args) {
        outer : for (int i = 1; i <= 10; i++) {
            System.out.print("Outer For -- " + i + "    ");
            inner : for(int j = 1; j <= 5 ; j++) {
                if(j == 3) {
                    break outer;
//                    System.out.println("xxxx");
                }
                System.out.print( j + "    ");
            }
            System.out.println();
        }
    }
}