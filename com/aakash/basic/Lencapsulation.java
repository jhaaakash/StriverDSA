package com.aakash.basic;

class Bank{
    private int balance;
    Bank(int balance)
    {
        this.balance=balance;
    }
    public void setBalance(int balance)
    {
        this.balance=balance;
    }
    public  int getBalance()
    {
        return balance;
    }

}
public class Lencapsulation {
    public static void main(String[] args) {
        Bank bank = new Bank(10);
        System.out.println(bank.getBalance());
        bank.setBalance(20);
        System.out.println(bank.getBalance());



    }
}
