import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String currentYear = "2025";
        String usersDateOfBirth = "1997";

        try {
            System.out.println(getInputFromConsole(Integer.parseInt(currentYear)));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(Integer.parseInt(currentYear)));
        }


    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, whats your name? ");
        System.out.println("Nice to meet you " + name + ", how are you today?");

        String birthyear = System.console().readLine("What is your birthyear " + name + "? ");
        int age = currentYear - Integer.parseInt(birthyear);

        return "" + age;
    }

    public static String getInputFromScanner(int currentYear) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, whats your name?");
        String name = scanner.nextLine();
        System.out.println("Nice to meet you " + name + ", how are you today?");

        System.out.println("What is your birthyear " + name + "? ");
        boolean isValidDOB = false;
        int age = 0;

        do {
            System.out.println("Please enter a value that is Higher than " + (currentYear - 120) + " and lower than " + currentYear);
            try {
                age = checkData(currentYear, scanner.nextLine());
                isValidDOB = age >= 0;
            } catch (NumberFormatException e) {
                System.out.println("Characters not allowed!");
            }

        } while (!isValidDOB);

        return "You are " + age;
    }

    public static int checkData(int currentYear, String birthyear) {
        int dob = Integer.parseInt(birthyear);
        int minimumYear = currentYear - 125;

        if ((dob < minimumYear) || (dob > currentYear)) {
            return -1;
        }

        return (currentYear - dob);
    }
}
