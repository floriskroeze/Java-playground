import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        if (findCustomer(customer) != null) {
            System.out.println("Customer: " + customer.getName() + " already exists");
            return;
        }

        customers.add(customer);
        System.out.println("Customer: " + customer.getName() + " added");
    }

    public Customer findCustomer(String name) {
        if (this.customers.isEmpty()) {
            System.out.println("Customer not found");
            return null;
        }

        for (Customer customer : customers) {
            if (customer.getName().equals(name)) {
                return customer;
            }
        }

        return null;
    }

    public Customer findCustomer(Customer customer) {
        return findCustomer(customer.getName());
    }

    public void addTransaction(String name, double amount) {
        Customer customer = findCustomer(name);

        if (customer == null) {
            return;
        }

        customer.getTransactions().add(amount);
        System.out.println(amount + " added to transactions");
    }

    public void printTransactions(String name) {
        Customer customer = findCustomer(name);

        if (customer == null) {
            return;
        }

        System.out.println("Customer: " + name);
        System.out.println(" Transactions: ");

        for (double transaction : customer.getTransactions()) {
            System.out.println("  --> " + transaction);
        }
    }
}
