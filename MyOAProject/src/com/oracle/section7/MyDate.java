package com.oracle.section7;

public class MyDate {
    private int day;
    private int month;
    private int year;
    // accessor / getter --> mengambil nilai
    public int getDay() {
        return day;
    }
    // mutator / setter --> memberi nilai
    public void setDay(int pDay) {
        if(pDay >= 1 && pDay <= 31) {
            day = pDay;
        } else {
            System.err.println(pDay + " Invalid day");
        }
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        if(month >= 1 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Invalid month");
        }
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
