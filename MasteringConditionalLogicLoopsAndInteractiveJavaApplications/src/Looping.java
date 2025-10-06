public class Looping {
    public static void main(String[] args) {
        double amount = 1000;
        for (int i = 1; i <= 10 ; i++) {

            amount += calculateInterest(amount, 8) + 1000;
            System.out.println(amount);
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
