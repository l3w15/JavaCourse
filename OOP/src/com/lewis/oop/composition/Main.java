package com.lewis.oop.composition;

public class Main {
    public static void main(String[] args) {
        Dimensions totalDimensions = new Dimensions(200, 80, 80);
        Dimensions fridgeDimensions = new Dimensions(95, 75, 75);
        Dimensions freezerDimensions = new Dimensions(95, 75, 75);

        FridgeFreezer fridgeFreezer = new FridgeFreezer("Samsung",
                4,
                4,
                totalDimensions,
                fridgeDimensions,
                freezerDimensions);

        Oven oven = new Oven("Hotpoint", "T1000", new Dimensions(60, 80, 80));

        Kitchen kitchen = new Kitchen(oven, fridgeFreezer);

        kitchen.preHeatOven(220);
        kitchen.preHeatOven(100);
        kitchen.preHeatOven(150);

        System.out.println(" ");

        kitchen.setTemp("freezer", -30);
        kitchen.setTemp("freezer", -22);

        kitchen.setTemp("fridge", 0);
        kitchen.setTemp("fridge", 2);

        kitchen.setTemp("oven", 220);

        System.out.println(" ");

        kitchen.getOven().turnGrillOnOrOff();
        kitchen.getOven().turnGrillOnOrOff();

        System.out.println(" ");

        kitchen.prepareToMakeRoastWithIceTea();
    }
}
