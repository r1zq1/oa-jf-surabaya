package com.oracle.section5;

public class IfElseTest {
    public static void main(String[] args) {
        int a = 10;
        if(a != 10) ;
        System.out.println("statement 1");
        System.out.println("xxx");
        
        String x = "Ora";
        String y = "cle";
        String z = "Oracle";
        System.out.println((x + y) == z);
        System.out.println((x + y).equals(z));
        
        String p = null;
        if(p != null && p.length() == 0) {
            System.out.println("st 1");
        } else {
            System.out.println("st 2");
        }
        
        if(true) {
            
        } else if(false) {
            
        } else {
                
        }
        
        boolean n = false;
        if(n = true) {
            System.out.println("a");
        } else {
            System.out.println("b");
        }
        
        String abc = "";
        switch (abc) {
            default:
                break;
            case "B":
                break;
            case "A":
                break;
            case "C":
                break;
        }
        
    }
}