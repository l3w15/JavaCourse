package com.lewis.oop.inheritance;

public class Vehicle {
    private int maxCapacity;
    private String propulsionMethod;
    private int velocity;

    public Vehicle() {
        this(1, "default propulsion method");
    }

    public Vehicle(int maxCapacity) {
        this(maxCapacity, "unknown method");
    }

    public Vehicle(int maxCapacity, String propulsionMethod) {
        this.maxCapacity = maxCapacity;
        this.propulsionMethod = propulsionMethod;
    }

    public void move(int speed) {
        this.velocity = speed;
        System.out.println("Vehicle moving at " + this.velocity + " mph");
    }

    public void stop() {
        this.velocity = 0;
        System.out.println("Vehicle has stopped");
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public String getPropulsionMethod() {
        return propulsionMethod;
    }

    public void setPropulsionMethod(String propulsionMethod) {
        this.propulsionMethod = propulsionMethod;
    }
}
