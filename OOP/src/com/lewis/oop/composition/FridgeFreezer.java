package com.lewis.oop.composition;

public class FridgeFreezer {
    private String manufacturer;
    private int fridgeShelves;
    private int freezerDrawers;
    private Dimensions totalDimensions;
    private Dimensions fridgeDimensions;
    private Dimensions freezerDimensions;
    private int fridgeTemp;
    private int freezerTemp;

    public FridgeFreezer(String manufacturer,
                         int fridgeShelves,
                         int freezerDrawers,
                         Dimensions totalDimensions,
                         Dimensions fridgeDimensions,
                         Dimensions freezerDimensions) {
        this.manufacturer = manufacturer;
        this.fridgeShelves = fridgeShelves;
        this.freezerDrawers = freezerDrawers;
        this.totalDimensions = totalDimensions;
        this.fridgeDimensions = fridgeDimensions;
        this.freezerDimensions = freezerDimensions;
        this.fridgeTemp = 5;
        this.freezerTemp = -18;


    }

    public void setFridgeTemp(int fridgeTemp) {
        if (fridgeTemp >= 2 && fridgeTemp <= 7) {
            this.fridgeTemp = fridgeTemp;
            System.out.println("Fridge temperature has been set to " + this.fridgeTemp + " degrees Celsuis");
        } else {
            this.fridgeTemp = -18;
            System.out.println("The temperature was outside of the range 2 - 7. " +
                    "Fridge temperature has been set to " + this.fridgeTemp + " degrees Celsuis");
        }
    }

    public void setFreezerTemp(int freezerTemp) {
        if (freezerTemp >= -25 && freezerTemp <= -15) {
            this.freezerTemp = freezerTemp;
            System.out.println("Freezer temperature has been set to " + this.freezerTemp + " degrees Celsuis");
        } else {
            this.freezerTemp = -18;
            System.out.println("The temperature was outside of the range -15 - -25. " +
                    "Freezer temperature has been set to " + this.freezerTemp + " degrees Celsuis");
        }
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getFridgeShelves() {
        return fridgeShelves;
    }

    public int getFreezerDrawers() {
        return freezerDrawers;
    }

    public Dimensions getTotalDimensions() {
        return totalDimensions;
    }

    public Dimensions getFridgeDimensions() {
        return fridgeDimensions;
    }

    public Dimensions getFreezerDimensions() {
        return freezerDimensions;
    }

    public int getFridgeTemp() {
        return fridgeTemp;
    }

    public int getFreezerTemp() {
        return freezerTemp;
    }
}
