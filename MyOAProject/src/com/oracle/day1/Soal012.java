package com.oracle.day1;

public class Soal012 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5);
        String s = "";
        System.out.println(System.identityHashCode(sb));
        System.out.println(System.identityHashCode(s));
        if(sb.equals(s)) {
            System.out.println("1");
        } else if(sb.toString().equals(s.toString())) {
            System.out.println("2");
        } else {
            System.out.println("No Match");
        }
    }
}
