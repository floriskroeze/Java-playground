public class Main {
    public static void main(String[] args) {
        MobilePhone mf = new MobilePhone("0612345678");
        mf.addNewContact(Contact.createContact("Henk", "0612356789"));
        mf.addNewContact(Contact.createContact("Jan", "0612356789"));
        mf.addNewContact(Contact.createContact("Kees", "0612356789"));

        mf.printContacts();
    }
}
