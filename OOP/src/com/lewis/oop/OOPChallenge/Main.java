package com.lewis.oop.OOPChallenge;


import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Hamburger myBurger = new Hamburger("beef");
        myBurger.addExtra("chips");
        myBurger.addExtra("kimchi");
        myBurger.addExtra("cheese");
        System.out.println("My burger costs: £" + myBurger.getPrice() + "0");
        System.out.println(myBurger.getRunningTotal());

        DeluxeBurger delBurger = new DeluxeBurger("chicken", "brown");
        delBurger.addExtra("kimchi");
        System.out.println(delBurger.getRunningTotal());

        HealthyBurger healthyBurger = new HealthyBurger("chicken");
        healthyBurger.addExtra("kimchi");

        healthyBurger.addExtra("drink");
        healthyBurger.addExtra("cabbage");
        System.out.println(healthyBurger.hasCabbage());
        System.out.println(healthyBurger.hasKimchi());
        System.out.println(healthyBurger.hasDrink());
        System.out.println(healthyBurger.getRunningTotal());

        System.out.println("******************************************");
        System.out.println("******************************************");
        System.out.println("******************************************");
        System.out.println("******************************************");
//
//        int num = getInt();
//
//        int[] array = readIntegers(num);
//        System.out.println(Arrays.toString(array));
//        System.out.println("Min val of array: " + findMin(array));

        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int getInt() {


        System.out.println("Please set the count :");
        return scanner.nextInt();
    }

    private static int[] readIntegers(int num) {
        System.out.println("Please enter " + num + " numbers:");
        int[] array = new int[num];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    private static int findMin(int[] array) {
        int x = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < x) {
                x = array[i];
            }
        }
        return x;
    }

//    private static void reverse(int[] array) {
//        int[] tempArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            tempArray[i] = array[i];
//        }
//        for (int i = 0; i < array.length; i++) {
//            array[i] = tempArray[array.length - 1 - i];
//        }
//    }

    private static void reverse (int[] array) {
        int maxIndex = array.length -1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}
