public class BankAccount {

    private String customerName;
    private String customerEmail;

    private int customerPhoneNumber;
    private int accountNumber;

    private double balance;

    public static void main(String[] args) {

    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return customerEmail;
    }

    public void setEmail(String email) {
        this.customerEmail = email;
    }

    public int getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(int customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            setBalance(this.balance + amount);
            System.out.println("Your new balance is: " + balance);
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void withdrawal(int amount) {
        if ((balance - amount ) > 0 && amount > 0) {
            setBalance(balance - amount);
            System.out.println("Your new balance is: " + balance);
        } else {
            System.out.println("Invalid amount");
        }
    }
}
