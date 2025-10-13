import java.util.Scanner;

public class ChallengeSeven {
    public static void main(String[] args) {
        minMaxTracker();
    }

    public static void minMaxTracker() {
        Scanner scanner = new Scanner(System.in);
        boolean isValidInput = true;
        double min = 0;
        double max = 0;
        int loopCount = 0;

        do {
            System.out.println("Please enter a valid number or any character to quit the loop");
            try {
                double newInput = Double.parseDouble(scanner.nextLine());

                if (loopCount == 0 || newInput < min) {
                    min = newInput;
                }

                if (loopCount == 0 || newInput > max) {
                    max = newInput;
                }

                loopCount++;
            } catch (NumberFormatException e) {
                System.out.println("Not a valid number, exiting program");
                isValidInput = false;
            }

        } while (isValidInput);
        if (loopCount > 0) {
            System.out.println("The min number is: " + min + " and the max number is: " + max);
        } else {
            System.out.println("No valid input from user");
        }
    }
}
