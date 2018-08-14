package com.lewis.oop.inheritance;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Account {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account() {
        this(10101010, 1.00, "default name", "default email", "default phone");
        System.out.println("Empty constructor called.");
    }

    public Account(int accountNumber,
                    double balance,
                    String customerName,
                    String email,
                    String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this. phoneNumber = phoneNumber;
    }

    public Account(String customerName, String email, String phoneNumber) {
        this(20202020, 2.00, customerName, email, phoneNumber);
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("You have succesfully deposited £" + amount + ".");
        System.out.println("Your new balance is £" + round(this.balance, 2));
    }

    public void withdraw(double amount) {
        if (this.balance - amount > 0) {
            this.balance -= amount;
            System.out.println("You have succesfully withdrawn £" + amount + ".");
            System.out.println("Your new balance is £" + round(this.balance, 2));
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }






}
