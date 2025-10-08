public class Main {
    public static void main(String[] args) {
        int j = 1;

        while (true) {
            if (j > 5) {
                break;
            }

            System.out.println("Iteration: " + j);
            j++;
        }

        int k = 1;

        while (k <= 5) {
            System.out.println("Iteration: " + k);
            k++;
        }

        int l = 1;
        boolean isReady = true;

        do {
            if (l >= 5) {
                isReady = false;
            }

            System.out.println("Iteration: " + l);
            l++;
        } while (isReady);
    }
}
