package com.lewis;

public class Main {

    public static void main(String[] args) {

        // byte has a width of 8
        byte myByteMinVal = -128;
        byte myByteMaxVal = 127;
        byte myNewByteVal = (byte) (myByteMaxVal / 2); // Unless expressed explicitly java assumes numbers are ints
        byte badByteVal = (byte) (myByteMaxVal * 2); // Although no compile error the output is -2
        System.out.println(badByteVal);

        // short has a width of 16
        short myShortMinVal = -32768;
        short myShortMaxVal = 32767;
        short myNewShortVal = (short) (myShortMaxVal / 2);

        // int has a width of 32
        int myMinValue = -2147483648;
        int myMaxValue = 2_147_483_647;

        // long has a width of 64
        // Largest number is 2 to the power of 63
        // You're supposed to put an "L" at the end of it
        long myLongValue = 400L;

        byte aByte = 90;
        short aShort = 10_000;
        int anInt = 2_100_100;
        long longTotal = 50000 + 10 * (aByte + aShort + anInt);
        System.out.println(longTotal);
    }
}
