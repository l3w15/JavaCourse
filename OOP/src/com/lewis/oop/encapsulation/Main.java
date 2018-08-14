package com.lewis.oop.encapsulation;

public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Fred";
//        player.health = 50;
//        player.weapon = "Axe of Doom";
//
//        int damage = 30;
//        player.loseHealth(damage);
//        System.out.println("Remaing health " + player.healthRemaining());
//
//        damage = 25;
//        player.loseHealth(damage);
//        System.out.println("Remaing health " + player.healthRemaining());

//        EnhancedPlayer encapusulatedPlayer = new EnhancedPlayer("Lew", 200, "Axe");
//        System.out.println("Encapsulated player health is " + encapusulatedPlayer.getHealth());
//
//        EnhancedPlayer lowerStartPower = new EnhancedPlayer("Boo", 50, "Sword");
//        System.out.println("Player created with health " + lowerStartPower.getHealth());
//
//        EnhancedPlayer minusStartPower = new EnhancedPlayer("Foo", -75, "Magic wand");
//        System.out.println("Player created with health " + minusStartPower.getHealth());

        Printer singlePagePrinter = new Printer("Single page printer",50, false);
        singlePagePrinter.printPages(51);
        singlePagePrinter.addToner(30);

        singlePagePrinter.printPages(-20);
        singlePagePrinter.addToner(200);

        singlePagePrinter.printPages(500);

        Printer duplexPrinter = new Printer("Duplex page printer",-50, true);
        duplexPrinter.printPages(100);
        duplexPrinter.addToner(50);


    }
}
