package com.oracle.day1;

public class Soal020 {
    public static void main(String[] args) {
        int x = 5;
        while(isAvailable(x)) {
            System.out.print(x);
            x--;    // B
        }
    }
    public static boolean isAvailable(int x) {
        return x-- > 0 ? true : false;
    }
}