package com.lewis.oop.OOPChallenge.Extras;

public class Extra {
    private String type;
    private double price;



    public Extra(String type) {
        this.type = type;
        this.price = getTypePrice(type);
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public double getTypePrice(String type) {
        if (this.type.equals("chips")) return 0.8;
        if (this.type.equals("tomato")) return 0.3;
        if (this.type.equals("cheese")) return 0.6;
        if (this.type.equals("bacon")) return 0.6;
        if (this.type.equals("cabbage")) return 0.4;
        if (this.type.equals("kimchi")) return 0.4;
        if (this.type.equals("drink")) return 0.8;

        return 0;
    }

}
