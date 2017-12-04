package com.oracle.section7;

public class Siswa {
    int nis;
    String nama;
    String alamat;
    double nilai;
    public Siswa() {
        this(-1,"anonymous","unknown",0.0);
        System.out.println("test 123");
    }
    public Siswa(int nis, String nama, String alamat, double nilai) {
        this.nis = nis;
        this.nama = nama;
        this.alamat = alamat;
        this.nilai = nilai;
    }
    public void displaySiswaInfo() {
        System.out.println("NIS: " + nis);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Nilai: " + nilai);
    }
}