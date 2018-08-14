package com.lewis;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = calculateAndPrintScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + finalScore);

        score = 10000;
        levelCompleted = 8;
        bonus =200;

        finalScore = calculateAndPrintScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + finalScore);

        String p1 = "Jim";
        String p2 = "John";
        String p3 = "Jane";
        String p4 = "Jenny";

        displayHighScorePosition(p4, calculateHighScorePosition(1500));
        displayHighScorePosition(p1, calculateHighScorePosition(900));
        displayHighScorePosition(p3, calculateHighScorePosition(400));
        displayHighScorePosition(p2, calculateHighScorePosition(50));

        printMegaBytesAndKiloBytes(0);
        System.out.println( bark(true, 1));
        System.out.println( bark(false, 2));
        System.out.println(bark(true, 8));
        System.out.println(bark(true, -1));

        System.out.println((float)Math.round(3.1756));

    }

    private static int calculateAndPrintScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    private static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get to position " + position + " in the high score table");
    }

    private static int calculateHighScorePosition(int score) {
        int pos = 4;
        if (score >= 1000) {
            pos = 1;
        } else if (score >= 500) {
            pos = 2;
        } else if (score >= 100) {
            pos = 3;
        }

        return pos;
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes >= 0) {
            int remainderKB = kiloBytes % 1024;
            int megaBytes = (kiloBytes - remainderKB)/1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " and " + kiloBytes + " KB");
        }
        System.out.println("Invalid Value");
    }

    public static boolean bark(boolean barking, int hourOfDay) {
        if ((hourOfDay < 8 || hourOfDay > 22) && barking) {
           return true;
        }
        return false;
    }
}
