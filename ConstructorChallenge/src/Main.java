public class Main {
    public static void main(String[] args) {
        Customer floris = new Customer("Floris", "email@email.com");

        System.out.println("Customer: " + floris.getName() + " has limit: " + floris.getCreditLimit() + " email: " + floris.getEmail());

        Customer unknown = new Customer();

        System.out.println("Customer: " + unknown.getName() + " has limit: " + unknown.getCreditLimit() + " email: " + unknown.getEmail());
    }
}
