package com.oracle.day1;

public class Soal023 {
    int x = 100;
    int a = x++;
    int b = ++x;
    int c = x++;
    int d = (a < b) ? (a < c) ? a : (b < c) ? b : c;
    System.out.println(d);    
}