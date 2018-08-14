package com.lewis;

public class Main {

    public static void main(String[] args) {
        char myChar = 'D';
        char uniCodeChar = '\u00AE';

        System.out.println("Unicode output = " + uniCodeChar);

        boolean isHappy = true;

        String numString = "50";
        int intNum = 49;
        System.out.println(numString + intNum);
        System.out.println(intNum + numString);
    }
}
