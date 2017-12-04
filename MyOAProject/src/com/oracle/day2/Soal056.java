package com.oracle.day2;

public class Soal056 {
    public static void main(int[] args) {
        System.out.println("int main " + args[0]);
    }
    public static void main(Object[] args) {
        System.out.println("Object main " + args[0]);
    }
    public static void main(String[] args) {
        args = new String[]{"1","2","3"};
        System.out.println("String main " + args[0]);
    }
}