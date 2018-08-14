import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your name: ");
//        String name = scanner.nextLine();
//
//        System.out.println("Enter your year of birth: ");
//        boolean hasNextInt = scanner.hasNextInt();
//        if (hasNextInt) {
//            int year = scanner.nextInt();
//            int age = 2018 - year;
//
//            scanner.nextLine(); // Handle nextline character (User pressing enter)
//
//            System.out.println("What do you want to do today?: ");
//            String activity = scanner.nextLine();
//            System.out.println("Hello " + name + "!");
//            if (age > 0 && age < 120) {
//                System.out.println("You are roughly " + (2018 - year) + " years old! I always enjoy" +
//                        " " + activity + ", let's do that!");
//            } else {
//                System.out.println("I think you entered an invalid birth year");
//            }
//        } else {
//            System.out.println("That's not an integer!");
//        }
//        scanner.close();
//        System.out.println(sumOfTenNumbers());
        minAndMax();
    }

    private static int sumOfTenNumbers() {
        int sum = 0;
        int numberCounter = 0;
        Scanner scanner = new Scanner(System.in);

        while (numberCounter < 10) {
            System.out.println("Enter number #" + (numberCounter + 1) + ":");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                sum += scanner.nextInt();
                numberCounter++;
            } else {
                System.out.println("That's not a number!");

            }
            scanner.nextLine();

        }
        scanner.close();
        return sum;
    }

    private static void minAndMax() {
        int num;
        int min = 0; // Can also use Integer.MAX_VALUE
        int max = 0; // Can also use Integer.MIN_VALUE to avoif the boolean below
        boolean first = true;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter number:");
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                num = scanner.nextInt();
                if (first) {
                    max = num;
                    min = num;
                    first = false;
                } else if (num < min) {
                    min = num;
                } else {
                    max = num;
                }
            } else {
                System.out.println("Min = " + min + ", Max = " + max);
                break;
            }
        }
        scanner.close();
    }
}
