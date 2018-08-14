package com.lewis.oop.inheritance;

public class TurboCar extends Car {

    public TurboCar(String model, String engine, String colour) {
        super(2, 2, 4, model, engine, colour, 6);
    }

    @Override
    public void getSpeed() {
        super.move(currentGear * 25);
    }
}
