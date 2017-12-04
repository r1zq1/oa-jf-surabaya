package com.oracle.section8;

import com.oracle.section7.Siswa;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(5);
        System.out.println(list1.isEmpty());
        list1.add("Agus");
//        list1.add(new Integer(100));
//        list1.add(new Siswa());
        list1.add("Anastasia");
        list1.add("Andri");
        list1.add(null);
        list1.add("Asmeri");
        list1.add(null);
        list1.add("Asri");
        list1.add("Andri");
        list1.add("Asmeri");
        System.out.println(list1);
        System.out.println(list1.size());
        list1.remove("Andri");
        System.out.println(list1.remove("Asmeri"));
        System.out.println(list1.remove("Budi"));
        System.out.println(list1);        
        System.out.println(list1.contains("Anastasia"));
        list1.add(1,"Badrun");
        System.out.println(list1);    
        list1.set(1, "Suwondo");
        System.out.println(list1);    
//        list1.remove(30);  ---> IOOBE
        for (String string : list1) {
            System.out.print(string + "   ");
        }
        
    }
}