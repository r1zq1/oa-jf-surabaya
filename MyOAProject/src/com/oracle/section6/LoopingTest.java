package com.oracle.section6;

public class LoopingTest {
    public static void main(String[] args) {
        abc: for (int i = 0; i < 10; i+=2) {
            System.out.println("Hello -- " + i);
        }
        
        int j = 0;
        def : while(j > 10) {
            System.out.println("While -- " + j);
            j++;
        }
        
        int k = 0;
        ghi: do {
            System.out.println("DoWhile -- " + k);
            k++;
        } while(k > 10);
        
//        System.out.println("a");
//        for(int z =0 ; z<10  ;z++  ){
//            System.out.println("b");
//        }
//        System.out.println(z);
//        System.out.println("c");
    }
}