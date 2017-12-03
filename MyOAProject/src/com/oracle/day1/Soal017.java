package com.oracle.day1;

class CheckingAccount {
    public int amount;
    public CheckingAccount(int amount) {
        this.amount = amount;
    }
    public int getAmount(){
        return amount;
    }
    public void changeAmount(int x) {
        amount += x;
    }
}
public class Soal017 {
    public static void main(String[] args) {
        CheckingAccount acct = new CheckingAccount((int)Math.random());
        // acct.changeAmount(0);  // D
        // acct.changeAmount(-acct.amount); // G
        acct.changeAmount(-acct.getAmount());  // H
        System.out.println(acct.getAmount());
    }
}