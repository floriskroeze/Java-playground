public class ChallengeFour {
    public static void main(String[] args) {
        int i = 4;
        int countOddNumbers = 0;
        int countEvenNumbers = 0;

        while (i <= 20) {
            i++;

            if (!isEvenNumber(i)) {
                countOddNumbers++;
                continue;
            }


            System.out.println(i + " is an even number");
            countEvenNumbers++;

            if (countEvenNumbers == 5 ) {
                break;
            }
        }

        System.out.println("There were: " + countEvenNumbers + " even numbers and: " + countOddNumbers + " odd numbers.");
    }

    public static boolean isEvenNumber(int number) {
        if (number < 0) {
            return false;
        }

        return (number % 2) == 0;
    }
}
