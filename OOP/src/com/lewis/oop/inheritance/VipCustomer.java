package com.lewis.oop.inheritance;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
        this("default name", 2000.0, "defaultEmail@me.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown email");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
