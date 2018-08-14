package com.lewis.oop.inheritance;

public class Car extends Vehicle {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;
    private int gearCount;
    public int currentGear;

    public Car() {
        this(5, 4, 4, "default model", "default engine", "black", 5);
    }

    public Car(String model, String engine, String colour) {
        this(5, 4, 4, model, engine, colour, 5);
    }

    public Car(int maxCapacity, int doors, int wheels, String model, String engine, String colour, int gearCount) {
        super(maxCapacity, "Combustion Engine");
        this.doors = doors;
        this.wheels = wheels;
        this.model = model;
        this.engine = engine;
        this.colour = colour;
        this.gearCount = gearCount;
        this.currentGear = 0;
    }

    public void steer(String direction) {
        if (direction.toLowerCase() != "left" && direction.toLowerCase() != "right") {
            System.out.println("Invalid steering direction");
        } else if (direction.toLowerCase() == "left") {
            System.out.println("You turned left");
        } else {
            System.out.println("You turned right");
        }
    }

    public void changeGear(String upOrDown) {
        if (upOrDown.toLowerCase() != "up" && upOrDown.toLowerCase() != "down") {
            System.out.println("Invalid change direction");
        } else if (upOrDown.toLowerCase() == "up" && this.currentGear + 1 <= this.gearCount) {
            this.currentGear += 1;
            System.out.println("Gear changed up. Current gear = " + this.currentGear);
        } else if (this.currentGear - 1 >= 0) {
            this.currentGear -= 1;
            System.out.println("Gear changed down. Current gear = " + this.currentGear);
        } else {
            System.out.println("That gear change is not possible");
        }
        getSpeed();
    }

    public void getSpeed() {
        super.move(currentGear * 15);
    }
}
