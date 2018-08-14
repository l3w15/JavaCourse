package com.lewis.oop.composition;

import java.util.concurrent.TimeUnit;

public class Oven {
    private String manufacturer;
    private String model;
    private Dimensions dimensions;
    private int currentTemp;
    private boolean isGrillOn;

    public Oven(String manufacturer, String model, Dimensions dimensions) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.dimensions = dimensions;
        this.currentTemp = 0;
        this.isGrillOn = false;
    }

    public void preHeat(int desiredTemp) {
        if (desiredTemp > 149 && desiredTemp < 251) {
            if (this.currentTemp < desiredTemp) {
                System.out.println("Heating oven to desired temperature");
                while (this.currentTemp != desiredTemp) {
                    try {
                        TimeUnit.MILLISECONDS.sleep(50);
                    } catch (InterruptedException ex) {
                        System.out.println("Wow, pausing is a pain in the ass in Java");
                    }
                    this.currentTemp += 1;
                }
                System.out.println("Oven has reached " + this.currentTemp + " degrees celcius");
            } else {
                System.out.println("Cooling oven to desired temperature");
                while (this.currentTemp != desiredTemp) {
                    try {
                        TimeUnit.MILLISECONDS.sleep(50);
                    } catch (InterruptedException ex) {
                        System.out.println("Wow, pausing is a pain in the ass in Java");
                    }
                    this.currentTemp -= 1;
                }
                System.out.println("Oven has reached " + this.currentTemp + " degrees celcius");
            }
        } else {
            System.out.println("Please select a desired temperature in the range 150 - 250");
        }
    }

    public void turnGrillOnOrOff() {
        isGrillOn = !isGrillOn;
        if (isGrillOn) {
            System.out.println("Grill has been turned on");
        } else {
            System.out.println("Grill has been turned off");
        }
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public int getCurrentTemp() {
        return currentTemp;
    }
}
