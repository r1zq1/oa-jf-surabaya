package com.oracle.day1;

public class Soal025_Employee {
    String name;
    boolean contract;
    double salary;
    public Soal025_Employee() {
        name = "Joe";
        contract = true;
        salary = 100.0F;
    }
    public String toString() {
        return name + ":" + contract + ":" + salary;
    }
    public static void main(String[] args) {
        Soal025_Employee e = new Soal025_Employee();
//        e.name = "Joe";
//        e.contract = true;
//        e.salary = 100;
        System.out.println(e);
    }
}