public class Challenges {
    private static final String ERROR = "Invalid Value";

    public static void main(String[] args) {
        printYearsAndDays(561600);
    }

    private static double area(double radius) {
        if (radius < 0) return -1;

        return Math.PI * radius * radius;
    }

    private static double area(double x, double y) {
        if (x < 0 || y < 0) return -1;

        return x * y;
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println(ERROR);
        } else {
            long remainingMinutes = minutes % 525600;
            long years = minutes / 525600;
            System.out.println(minutes + " min = " + years + " y and " + remainingMinutes/1440 + " d");
        }
    }

    public static void printEqual(int first, int second, int third) {
        if (first < 0 || second < 0 || third < 0) {
            System.out.println(ERROR);
        } else if (first == second && first == third) {
            System.out.println("All numbers are equal");
        } else if (first == second || first == third || second == third) {
            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("All numbers are different");
        }
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer && (temperature > 24 && temperature < 46)) {
            return true;
        } else if (!summer && (temperature > 24 && temperature < 36)) {
            return true;
        }

        return false;
    }
}
