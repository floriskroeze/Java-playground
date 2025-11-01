import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] randomArray = getRandomArray(10);
        System.out.println(Arrays.toString(randomArray));
        Arrays.sort(randomArray);
        System.out.println(Arrays.toString(randomArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        String[] sArray = {"Jaap", "Kees", "Henk", "Peter", "David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray, "Jaap") >= 0) {
            System.out.println("Found Jaap");
        }

        int[] firstTestArray = {1, 2, 3, 4, 5};
        int[] secondTestArray = {1, 2, 3, 4, 5};

        if(Arrays.equals(firstTestArray, secondTestArray)) {
            System.out.println("Its a match");
        }

    }

    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];

        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }

        return newInt;
    }
}