package com.oracle.section7;

public class SiswaTest {
    public static void main(String[] args) {
        Siswa s1 = new Siswa();
        s1.nis = 20171204;
        s1.nama = "Anton";
        s1.alamat = "Surabaya";
        s1.nilai = 8.9;
        s1.displaySiswaInfo();
        
        Siswa s2 = new Siswa(20171205, "Badu", "Sidoarjo", 8.6);
        s2.displaySiswaInfo();
        
        Siswa s3 = new Siswa();
        s3.displaySiswaInfo();
        
        System.out.printf("nama siswa %s nilainya %.2f %n", s1.nama, s1.nilai);
        System.out.printf("%x %n",10);
        System.out.printf("%d %n",10);
        System.out.printf("%o %n",10);
        System.out.printf("%b %n",500);
    }
}