package com.oracle.day2;

public class Soal038 {
    public static void main(String[] args) {
        double discount = 0;
//        int qty = Integer.parseInt(args[0]);
        // test
        int qty = 70;
        // A
        if(qty >= 90) { discount = 0.5; }
        if(qty > 80 && qty < 90) { discount = 0.2; }
        
        // C
        discount = (qty >= 90)? 0.5 : (qty > 80) ? 0.2 : 0;

        // result
        System.out.println(discount);
    }
}