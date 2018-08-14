public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int num = (5 * 5) + (100 / 5);
        int numTwo = 6;
        System.out.println(num/numTwo);

        int result = 5;
        result = result % 3;
        System.out.println(result);

        System.out.println(areEqualByThreeDeciamlPlaces(-3.175, -3.176));
        int newScore = calculateScore("Jim", 200);
        System.out.println(newScore);

        System.out.println(calculateScore(300));
        System.out.println(calculateScore());
        System.out.println(calcFeetAndInchesToCentimetres(71));
    }

    public static boolean areEqualByThreeDeciamlPlaces(double numOne, double numTwo) {
        return ((int)(numOne * 1000) == (int) (numTwo * 1000));
    }

    public static boolean hasEqualSum(int first, int second, int sum) {
        return first + second == sum;
    }

    public static boolean hasTeen(int first, int second, int third) {
        for (int i = 13; i < 20; i++) {
            if (first == i || second == i || third == i) {
                return true;
            }
        }
        return false;
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Anonymous player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("Zero players zero points");
        return 0;
    }

    public static double calcFeetAndInchesToCentimetres(double feet, double inches) {
        if ((feet >= 0) && (inches >= 0 && inches <= 12)) {
            double totalInches = (feet * 12) + inches;
            System.out.println(totalInches);
            return totalInches * 2.54;
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimetres(double inches) {
        if (inches >= 0) {
            double remainingInches = inches % 12;
            System.out.println(remainingInches);
            double totalFeet = (inches - remainingInches)/12;
            System.out.println(totalFeet);
            return calcFeetAndInchesToCentimetres(totalFeet,remainingInches);
        }
        return -1;
    }
}
