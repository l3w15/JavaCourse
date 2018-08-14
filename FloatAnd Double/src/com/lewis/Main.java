package com.lewis;

public class Main {

    public static void main(String[] args) {
        int myIntVal = 5/2;
        float myFloatValA = (float) (5.4);
        float myFloatValB = 5.4f;
        float myFloatVal = 5f/3;
        // generally best to use doubles
        double myDoubleVal = 5d/3;

        System.out.println("myIntVal = " + myIntVal);
        System.out.println("myFloatVal = " + myFloatVal);
        System.out.println(("myDoubleVal = " + myDoubleVal));

        double pounds = 200d;
        double kilograms = pounds * 0.45359237d;
        System.out.println(pounds + " pounds is roughly " + kilograms + " kilograms");
    }
}
