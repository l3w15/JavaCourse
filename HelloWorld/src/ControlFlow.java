import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ControlFlow {
    private static final String ENTERED_CHAR_STR = "You entered a... ";

    public static void main(String[] args) {
//        int value = 1;
//        switch(value) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("Was a 3, 4 or 5");
//                break;
//            default:
//                System.out.println("Was not in range 1-5");
//                break;
//        }
//
//        char character = 'A';
//        switch(character) {
//            case 'A': case 'B': case 'C':
//                System.out.println(ENTERED_CHAR_STR + character);
//                System.out.println("Well done that was in range!");
//                break;
//
//            default:
//                System.out.println(ENTERED_CHAR_STR + character);
//                System.out.println("Character " + character + " not in range");
//        }

//        printDayOfTheWeek(8);
//
//        printPrimes(13, 20);
//
//        printFizzBuzzesAndSum(1, 1000);
//
//        System.out.println(sumOdd(1, 100));
//
//        printEven(0, 11);
//
//        System.out.println(sumDigits(123456789));
//
//        System.out.println(isPalindrome(-12321));
//
//        System.out.println(hasSameLastDigit(1,1,1));
//
//        numberToWords(432100);
//
//        System.out.println(canPack(2,2,12));

//        System.out.println(getLargestPrime(217));

        printSquareStar(4);
    }

    private static void printDayOfTheWeek(int index) {

        List<String> weekArray = Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");
        if (index < 0 || index > weekArray.size()) {
            System.out.println("Invalid day");
            return;
        }
        System.out.println(weekArray.get(index));
    }

    public static void printNumberInWord(int number) {
        switch(number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }

    private static boolean isPrime(int n) {
        if(n ==1) {
            return false;
        }

        for (int i = 2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void printPrimes(int start, int end) {
        int counter = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                counter ++;
                System.out.println("Prime number " + counter + " is " + i);
            } else if (counter > 2) {
                return;
            }
        }
    }

    private static void printFizzBuzzesAndSum(int start, int end) {
        int count = 0;
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count ++;
                System.out.println("FizzBuzz " + count + " is " + i);
                sum += i;
            } else if (count > 4) {

                System.out.println("Total of all FizzBuzzes: " + sum);
                return;
            }
        }
    }

    private static boolean isOdd(int number) {
        if (number < 0) return false;
        if (number % 2 == 0) return false;
        return true;
    }

    private static int sumOdd(int start, int end) {
        if (start < 0 || end < 0 || end < start) return -1;
        int sum = 0;
        while (start <= end) {
            if (isOdd(start)) {
                sum += start;
            }
            start++;
        }
        return sum;
    }

    private static void printEven(int num, int end) {
        while (num <= end) {
            if(isOdd(num)) {
                num++;
                continue;
            }
            System.out.println(" Even number " + num);
            num++;
        }
    }

    private static int sumDigits(int num) {
        if(num <= 9) return -1;
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num /10;
        }
        return sum;
    }

    public static boolean isPalindrome(int number) {
        int original = number;
        int reverse = 0;
        while (number != 0) {
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }
        return (original == reverse);
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) return -1;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }

    public static boolean hasSharedDigit(int first, int second) {
        if(first < 10 || first > 99 || second < 10 || second > 99) return false;
        int firstFirst = first / 10;
        int firstSecond = first % 10;
        int secondFirst = second / 10;
        int secondSecond = second % 10;
        return (firstFirst == secondFirst
                || firstFirst == secondSecond
                || firstSecond == secondFirst
                || firstSecond == secondSecond);
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if(a < 10 || a > 1000 || b < 9 || b > 1000 || c < 9 || c > 1000) return false;
        int aLastDigit = a % 10;
        int bLastDigit = b % 10;
        int cLastDigit = c % 10;
        if (aLastDigit == bLastDigit || aLastDigit == cLastDigit || bLastDigit == cLastDigit) return true;
        System.out.println("digits: " + aLastDigit + bLastDigit + cLastDigit );
        return false;
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) return -1;
        int num = Math.min(first, second);
        while (num > 0) {
            if (first % num == 0 && second % num == 0) return num;
            num--;
        }
        return -1;
    }

    public static void printFactors(int number) {
        if (number < 1) System.out.println("Invalid Value");
        int factor = 1;
        while (factor <= number) {
            if (number % factor == 0) System.out.println(factor);
            factor++;
        }
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) return false;
        int factor = 1;
        int sumFactors = 0;
        while (factor < number) {
            if (number % factor == 0) sumFactors += factor;
            factor++;
        }
        return (sumFactors == number);
    }

    public static void numberToWords(int number) {
        if (number < 0) System.out.println("Invalid Value");
        int digitCount = getDigitCount(number);
        number = reverse(number);

        while (digitCount > 0) {
            int digit = number % 10;
            switch(digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
            number /= 10;
            digitCount -= 1;
        }
    }

    public static int reverse(int num) {
        int reversedNum = 0;
        while (num != 0) {
            reversedNum *= 10;
            reversedNum += num % 10;
            num /= 10;
        }
        return reversedNum;
    }

    public static int getDigitCount(int num) {
        if (num < 0) return -1;
        if (num == 0) return 1;
        int count = 0;
        while (num > 0) {
            num /= 10;
            count += 1;
        }
        return count;
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;
        while (goal > 4 && bigCount > 0) {
            goal -= 5;
            bigCount -= 1;
        }
        while (goal > 0 && smallCount > 0) {
            goal -= 1;
            smallCount -= 1;
        }
        return goal == 0;
    }

    public static int getLargestPrime(int number) {
        if (number < 1) return -1;
        int divisor = number / 2;
        while (divisor > 1) {
            for (int i = 2; i <= divisor / 2; i++) {
                if (divisor % i == 0) {
                    divisor -= 1;
                    continue;
                }
                if (number % divisor == 0) {
                    break;
                }
            }
        }
        return divisor;
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        int row;
        int col;
        for (int i = 1; i <= number; i++) {
            row = i;
            for (int j = 1; j <= number; j++) {
                col = j;
                if (row == 1 || row == number) {
                    System.out.print("*");
                } else if (col == 1 || col == number) {
                    System.out.print("*");
                } else if (col == row || col == number - row + 1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


}
