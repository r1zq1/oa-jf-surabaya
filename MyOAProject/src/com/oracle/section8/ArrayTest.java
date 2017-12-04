package com.oracle.section8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ArrayTest {
    public static void main(String[] args) throws FileNotFoundException{
        int [] a = new int[4];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        
        for(int i = 0; i < a.length ; i++) {
            System.out.print(a[i] + "    ");
        }
        System.out.println();
        // enhanced for loop / for-each
        for (int xxx : a) {
            System.out.print(xxx + "   ");
        }
        System.out.println();
        
        System.out.println(a[4]);
        
        System.out.println("Goodbye");
//        try {
            FileInputStream fis = new FileInputStream("abc.txt");
//        } catch (Exception e) {
//            
//        }
    }
}