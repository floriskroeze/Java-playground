public class Main {
    public static void main(String[] args) {
        BankAccount floris = new BankAccount();
        floris.setBalance(100);
        floris.setAccountNumber(1234567);
        floris.setCustomerName("Floris");
        floris.setEmail("floris@mail.nl");
        floris.setCustomerPhoneNumber(12312123);

        System.out.println(floris.getBalance());
        floris.withdrawal(50);
        floris.deposit(-10);
        floris.deposit(10);
        floris.withdrawal(100);
    }
}
