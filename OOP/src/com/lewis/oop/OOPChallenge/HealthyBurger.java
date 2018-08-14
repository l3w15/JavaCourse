package com.lewis.oop.OOPChallenge;

import com.lewis.oop.OOPChallenge.Extras.Extra;

public class HealthyBurger extends Hamburger {
    private boolean addCabbage = false;
    private boolean addKimchi = false;

    public HealthyBurger(String meat) {
        super(meat);
        this.setRollType("brown");
        this.setPrice(3.8);
        this.setRunningTotal("Healthy Burger: £" + this.getPrice() + "0\n");
    }

    public void addExtra(String extraType) {
        super.addExtra(extraType);
        Extra extra = new Extra(extraType);
        if (extra.getType().equals("cabbage")) {
            this.addCabbage = true;
        } else if (extra.getType().equals("kimchi")) {
            this.addKimchi = true;
        } else {
            return;
        }
        super.updateRunningTotal(extra);
        super.addExtraCost(extra.getPrice());
    }

    public boolean hasCabbage() {
        return addCabbage;
    }

    public boolean hasKimchi() {
        return addKimchi;
    }
}
