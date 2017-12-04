package com.oracle.day2;

public class Soal062 {
    public static void main(String[] args) {
        int [] intArr = {8,16,32,64,128};
        // B
        for (int i : intArr) {
            System.out.print(i + "  ");
        }
        // E
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + "  ");
        }
    }
}