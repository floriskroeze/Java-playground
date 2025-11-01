import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] randomIntArray = generateRandomIntArray(10);
        System.out.println(Arrays.toString(randomIntArray));
        int[] reversedArray = sortReverse(randomIntArray);
        System.out.println(Arrays.toString(reversedArray));
    }

    private static int[] generateRandomIntArray(int len) {
        if (len <= 0) {
            len = 1;
        }

        Random random = new Random();
        int [] intArray = new int[len];

        for (int i = 0; i < len; i++) {
            intArray[i] = random.nextInt(101);
        }

        return intArray;
    }

    private static int[] sortReverse(int[] array) {
        if (array == null) {
            return new int[0];
        }

        int[] reverseArray = new int[array.length];
        Arrays.sort(array);

        for (int i = array.length - 1; i >= 0; i--) {
            reverseArray[i] = array[(array.length - 1) - i];
        }

        return reverseArray;
    }
}