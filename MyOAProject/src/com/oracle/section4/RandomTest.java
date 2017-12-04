package com.oracle.section4;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random rnd = new Random();
        System.out.println(rnd.nextBoolean());
        System.out.println(rnd.nextInt());
        System.out.println(rnd.nextInt(100));
        System.out.println(rnd.nextDouble());
        System.out.println(rnd.nextLong());
    }
}
