import java.util.Scanner;

public class ChallengeSix {
    public static void main(String[] args) {
        inputNumber();
    }

    public static void inputNumber() {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;

        do {
            try {
                System.out.println("Enter number #" + count);
                sum += Integer.parseInt(scanner.nextLine());
                count++;
            } catch (NumberFormatException e) {
                System.out.println("This was not a valid number, try again please");
            }
        } while (count <= 5);

        System.out.println("The sum of these number is: " + sum);
    }
}
