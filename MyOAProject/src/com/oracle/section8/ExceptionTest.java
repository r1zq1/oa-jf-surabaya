package com.oracle.section8;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionTest {
    public void methodA() throws Exception {
        throw new Exception();
    }
    public void methodB() throws Exception {
        methodA();
    }
    public void methodC() throws Exception {
        methodB();
    }
    public static void main(String[] args) {
        try {
            new ExceptionTest().methodC();
        } catch (Exception ex) {
            System.out.println("Handler .................");
        }
    }
}
