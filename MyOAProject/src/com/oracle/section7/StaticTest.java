package com.oracle.section7;

class Person {
    String nama;
    static String alamat;
    public String toString() {
        return "Person{" + nama + ":" + alamat + "}";
    }    
    public void methodA() {
        String x = nama;
        String y = alamat;
    }
    public static void methodB() {
//        String x = nama;
        String x = new Person().nama;
        String y = alamat;
    }
}
public class StaticTest {
    public static void main(String[] args) {
//        Person.nama = "Abc";
        Person p1 = new Person();
        Person p2 = new Person();
        p1.nama = "Andi";
        p1.alamat = "Surabaya";
        p2.nama = "Budi";
        p2.alamat = "Semarang";
        Person.alamat = "Denpasar";
        System.out.println(p1);
        System.out.println(p2);
    }
}
