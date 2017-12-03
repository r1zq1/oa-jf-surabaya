package com.oracle.day1;

public class Soal019 {
    void redCard(int cardNo) throws Exception {
        System.out.println("Reading Card");
    }
    void checkCard(int cardNo) throws RuntimeException {
        System.out.println("Checking Card");
    }   
    public static void main(String[] args) {        // line n1
        Soal019 ex = new Soal019();
        int cardNo = 12344;
        ex.checkCard(cardNo);          // line n2
        ex.redCard(cardNo);             // line n3
    }
}