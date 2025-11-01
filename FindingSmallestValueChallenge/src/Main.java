import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray = readIntegers();
        System.out.println(Arrays.toString(myIntArray));
        int minValue = minValue(myIntArray);
        System.out.println(minValue);
    }

    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a comma delimited list of numbers");
        String listOfNumbers = scanner.nextLine();
        String[] stringArray = listOfNumbers.replaceAll("\\s+", "").split(",");
        int[] intArray = new int[stringArray.length];

        for(int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }

        return intArray;
    }

    private static int minValue(int[] array) {
        int[] cloneOfArray = array.clone();
        Arrays.sort(cloneOfArray);
        return cloneOfArray[0];
    }
}