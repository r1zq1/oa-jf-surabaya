package com.oracle.day1;

import java.io.IOException;

class X {
    public void printFileContent() throws IOException {   // Option C
        /* code goes here */
        throw new IOException();
    }
}
public class Soal008 {
    public static void main(String[] args) throws Exception {  // Option A
        X xobj = new X();
        xobj.printFileContent();
    }
}
