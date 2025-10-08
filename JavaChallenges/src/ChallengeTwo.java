public class ChallengeTwo {
    public static void main(String[] args) {
        System.out.println("1 is " + (isPrimeNumber(1) ? "" : "NOT ") + "a prime number");
        System.out.println("2 is " + (isPrimeNumber(2) ? "" : "NOT ") + "a prime number");
        System.out.println("8 is " + (isPrimeNumber(8) ? "" : "NOT ") + "a prime number");
        System.out.println("17 is " + (isPrimeNumber(17) ? "" : "NOT ") + "a prime number");
        System.out.println("969 is " + (isPrimeNumber(969) ? "" : "NOT ") + "a prime number");

        System.out.println(getNumberOfPrimes(1, 999));
    }

    public static boolean isPrimeNumber(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor < wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    public static String getNumberOfPrimes(int rangeStart, int rangeStop) {
        if (rangeStart < 1 || rangeStop > 999) {
            return "Invalid Value";
        }

        int numberOfPrimes = 0;

        for (int increment = rangeStart; increment <= rangeStop; increment++) {
            if (isPrimeNumber(increment)) {
                System.out.println("Prime found: " + increment);
                numberOfPrimes++;
            }
        }

        return "There are " + numberOfPrimes + " prime numbers in this range";
    }
}
