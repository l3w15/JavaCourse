package com.lewis.oop.OOPChallenge;

import com.lewis.oop.OOPChallenge.Extras.Extra;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Hamburger {
    private String meat;
    private String rollType;
    private double price = 4.0;
    private boolean addChips = false;
    private boolean addCheese = false;
    private boolean addTomato = false;
    private boolean addBacon = false;
    private boolean addDrink = false;
    private int extraCount = 0;
    private String runningTotal = "Basic " + this.getClass().getSimpleName() + ": £" + this.price + "0\n";

    public Hamburger(String meat, String rollType) {
        this.meat = meat;
        this.rollType = rollType;
    }

    public Hamburger(String meat) {
        this.meat = meat;
    }

    public void addExtra(String extraType) {
        Extra extra = new Extra(extraType);
        if (extra.getType().equals("chips")) {
            this.addChips = true;
        } else if (extra.getType().equals("cheese")) {
            this.addCheese = true;
        } else if (extra.getType().equals("tomato")) {
            this.addTomato = true;
        } else if (extra.getType().equals("bacon")) {
            this.addBacon = true;
        } else if (extra.getType().equals("drink")) {
            this.addDrink = true;
        } else {
            return;
        }
        extraCount += 1;
        updateRunningTotal(extra);
        addExtraCost(extra.getPrice());
    }

    public void updateRunningTotal(Extra extra) {
        this.runningTotal += "Additional " + extra.getType() + ": £" + extra.getPrice() + "0\n";
    }

    public void addExtraCost(double cost) {
        this.price += cost;
    }

    public int getExtraCount() {
        return extraCount;
    }

    public void setRunningTotal(String runningTotal) {
        this.runningTotal = runningTotal;
    }

    public String getRunningTotal() {
        return runningTotal += "Total: £" +
                (double)Math.round(this.price * 100)/100 +
                "0\n";
    }

    public void setRollType(String rollType) {
        this.rollType = rollType;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMeat() {
        return meat;
    }

    public String getRollType() {
        return rollType;
    }

    public double getPrice() {
        return price;
    }

    public boolean hasChips() {
        return addChips;
    }

    public boolean hasDrink() {
        return addDrink;
    }

    public boolean hasCheese() {
        return addCheese;
    }

    public boolean hasTomato() {
        return addTomato;
    }

    public boolean hasBacon() {
        return addBacon;
    }
}
