package com.oracle.day2;

class Alpha {
    int ns;
    static int s;
    public Alpha(int ns) {
        if(s < ns) {
            s = ns;
            this.ns = ns;
        }
    }    
    void doPrint(){
        System.out.println("ns = " + ns + " s = " + s);
    }
}
public class Soal033 {
    public static void main(String[] args) {
        Alpha ref1 = new Alpha(50);
        Alpha ref2 = new Alpha(125);
        Alpha ref3 = new Alpha(100);
        ref1.doPrint();
        ref2.doPrint();
        ref3.doPrint();
    }
}