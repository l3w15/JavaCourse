package com.lewis.oop.encapsulation;

public class Printer {
    private String name;
    private double tonerLevel = 100;
    private int pagesPrinted = 0;
    private boolean isDuplex;

    Printer(String name, int tonerLevel, boolean isDuplex) {
        if (tonerLevel >= 1 && tonerLevel <= 100) {
            System.out.println("Less than 100 greater than 1");
            this.tonerLevel = tonerLevel;
        }
        this.isDuplex = isDuplex;
        this.name = name;
    }

    void addToner(int tonerPercent) {
        System.out.println(this.name + ": Attempting to add toner");
        if (tonerPercent >= 1 && tonerPercent <= 100) {
            this.tonerLevel += tonerPercent;
            if (this.tonerLevel > 100) this.tonerLevel = 100;
            System.out.println(this.name + ": Toner is now filled to " + this.tonerLevel + "%");
        } else {
            System.out.println(this.name + ": Please enter a valid toner percentage to add");
        }
        System.out.println(" ");
    }

    void printPages(int pagesToBePrinted) {
        if (pagesToBePrinted < 1) {
            System.out.println(this.name + ": Please enter a positive number of pages to be printed");
        } else {
            if (this.isDuplex) {
                int remainingPage = pagesToBePrinted % 2;
                pagesToBePrinted /= 2;
                pagesToBePrinted += remainingPage;
            }
            while (pagesToBePrinted > 0 && this.tonerLevel > 0) {
                pagesToBePrinted -= 1;
                this.tonerLevel -= 0.5;
                pagesPrinted += 1;
            }


            System.out.println(this.name + ": Pages printed = " + this.pagesPrinted);
            System.out.println(this.name + ": Toner level = " + this.tonerLevel + "%");

            if (tonerLevel <= 0) {
                System.out.println(this.name + ": Toner is empty");
            }

        }
        System.out.println(" ");
    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
