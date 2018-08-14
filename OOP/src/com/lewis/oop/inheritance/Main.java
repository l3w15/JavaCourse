package com.lewis.oop.inheritance;

public class Main {

    public static void main(String[] args) {
//	    FirstCar porsche = new FirstCar();
//	    FirstCar ford = new FirstCar();
//	    porsche.setModel("911");
//
//        System.out.println("Model: " + porsche.getModel());
//
//        Account myAccount = new Account();
//        myAccount.deposit(200.00);
//        myAccount.withdraw(100.55);
//        myAccount.withdraw(100.0);
//        System.out.println(" ");
//
//        Account fredsAccount = new Account(12345678,
//                0.0,
//                "fred",
//                "fred@fred.com",
//                "(01234) 4567789");
//        fredsAccount.withdraw(200.0);
//        fredsAccount.deposit(3000.0);
//        fredsAccount.withdraw(50.0);
//        fredsAccount.withdraw(4000.0);
        Car newCar = new TurboCar("Golf GTI", "1.8 petrol", "blue");
        newCar.changeGear("up");
        newCar.steer("right");
        newCar.changeGear("up");
        newCar.changeGear("up");
        newCar.changeGear("up");
        newCar.changeGear("up");
        newCar.steer("left");
        newCar.changeGear("up");
        newCar.changeGear("down");
        newCar.changeGear("down");
        newCar.changeGear("down");
        newCar.changeGear("down");
        newCar.changeGear("down");
        newCar.changeGear("down");
        newCar.changeGear("down");

    }
}
