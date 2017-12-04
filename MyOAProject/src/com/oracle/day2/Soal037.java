package com.oracle.day2;

public class Soal037 {
    static int count = 0;
    int i = 0;
    public void changeCount() {
        while (i < 5) {            
            i++;
            count++;
        }
    }
    public static void main(String[] args) {
        Soal037 check1 = new Soal037();
        Soal037 check2 = new Soal037();
        check1.changeCount();
        check2.changeCount();
        System.out.println(check1.count + " : " + check2.count);
    }
}