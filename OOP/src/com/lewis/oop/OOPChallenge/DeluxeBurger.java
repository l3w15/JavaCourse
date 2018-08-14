package com.lewis.oop.OOPChallenge;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger(String meat, String rollType) {
        super(meat, rollType);
        super.addExtra("chips");
        super.addExtra("drink");
    }

    @Override
    public void addExtra(String extraType) {
        System.out.println("Sorry no extra extras on the deluxe!");
    }
}
