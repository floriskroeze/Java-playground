public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Henk");

        Bank bank = new Bank("ING");
        bank.addCustomer(customer1);
        bank.addCustomer(customer1);

        bank.addTransaction("Henk", 1.00);
        System.out.println(customer1.getTransactions());
        bank.printTransactions("Henk");
    }
}
