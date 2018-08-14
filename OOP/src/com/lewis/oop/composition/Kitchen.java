package com.lewis.oop.composition;

public class Kitchen {
    private Oven oven;
    private FridgeFreezer fridgeFreezer;

    public Kitchen(Oven oven, FridgeFreezer fridgeFreezer) {
        this.oven = oven;
        this.fridgeFreezer = fridgeFreezer;
    }

    public void preHeatOven(int desiredTemp) {
        oven.preHeat(desiredTemp);
    }

    public void setTemp(String fridgeOrFreezer, int desiredTemp) {
        if (!fridgeOrFreezer.toLowerCase().equals("fridge") && !fridgeOrFreezer.toLowerCase().equals("freezer")) {
            System.out.println("Invalid fridge or freezer selection");
        } else if (fridgeOrFreezer.toLowerCase().equals("fridge")) {
            fridgeFreezer.setFridgeTemp(desiredTemp);
        } else {
            fridgeFreezer.setFreezerTemp(desiredTemp);
        }
    }

    public void prepareToMakeRoastWithIceTea() {
        System.out.println("Preparing for roast dinner with ice tea...");
        setFreezerForQuickIce();
        setOvenForRoast();
    }

    private void setOvenForRoast() {
        oven.preHeat(220);
    }

    private void setFreezerForQuickIce() {
        fridgeFreezer.setFreezerTemp(-25);
    }

    public Oven getOven() {
        return oven;
    }


}
