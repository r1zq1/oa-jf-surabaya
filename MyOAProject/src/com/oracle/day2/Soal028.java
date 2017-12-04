package com.oracle.day2;

public class Soal028 {
    static int i;
    int j;
    public static void main(String[] args) {
        Soal028 x1 = new Soal028();
        Soal028 x2 = new Soal028();
        x1.i = 3;
        x1.j = 4;
        x2.i = 5;
        x2.j = 6;
        System.out.println(x1.i + " " + x1.j + " " + x2.i + " " + x2.j);
    }
}