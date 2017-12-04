package com.oracle.section4;

public class StringTest {
    public static void main(String[] args) {
        String a = "Hello";
        String b = new String("Hello");
        String c = "Hello";
        
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.compareTo(b));
        System.out.println('A' - 'a');
        System.out.println("A".compareToIgnoreCase("a"));
        
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));
        a = a + " apa kabar?";
        System.out.println(System.identityHashCode(a));
        
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(System.identityHashCode(sb));        
        sb = sb.append(" apa kabar?");
        System.out.println(System.identityHashCode(sb));     
        
        String x = "Welcome to Java";
        System.out.println(x.substring(5));
        System.out.println(x.substring(5,10));
        System.out.println(x.charAt(7));
        System.out.println(x.indexOf('a'));
        System.out.println(x.indexOf('a',13));
        System.out.println(x.indexOf('x'));
        System.out.println(x.replace('a', 'o'));
        System.out.println(x.replaceFirst("o", "X"));
    }
}