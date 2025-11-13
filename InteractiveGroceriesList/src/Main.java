import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GroceryList groceries = new GroceryList();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;



        while(flag) {
            printActions();

            int userInput;

            try {
                userInput = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                continue;
            }

            switch (userInput) {
                case 1 -> {
                    System.out.println("Please enter the item you wish to add");
                    groceries.addItem(scanner.nextLine().trim().split(","));
                }
                case 2 -> {
                    System.out.println("Please enter the item you wish to remove");
                    groceries.removeItem(scanner.nextLine());
                }
                default -> flag = false;
            }
        }
    }

    private static void printActions() {
        System.out.println("Available actions:");
        System.out.println("0 - to shutdown");
        System.out.println("1 - to add item(s) to list (comma delimited list)");
        System.out.println("2 - to remove any items (comma delimited list)");
        System.out.println("Enter a number for which action you want to do: ");
    }

    public static void optionOne() {

    }
}