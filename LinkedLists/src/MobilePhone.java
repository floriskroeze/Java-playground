import java.util.ArrayList;
import java.util.Objects;

public class MobilePhone {
    private ArrayList<Contact> myContacts;
    private String myNumber;

    public MobilePhone(String myNumber) {
        this.myContacts = new ArrayList<Contact>();
        this.myNumber = myNumber;
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact) != -1) {
            return false;
        }

        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int indexOfOldContact = findContact(oldContact);

        if (indexOfOldContact == -1) {
            return false;
        }

        this.myContacts.set(indexOfOldContact, newContact);
        return true;
    }

    public boolean removeContact(Contact contact) {
        if (myContacts.isEmpty()){
            return false;
        }

        if (findContact(contact) == -1) {
            return false;
        }

        myContacts.remove(queryContact(contact.getName()));
        return true;
    }

    private int findContact(Contact contact) {
        return findContact(contact.getName());
    }

    private int findContact(String name) {
        if(myContacts.isEmpty()){
            return -1;
        }

        for (int i = 0; i < myContacts.size(); i++) {
            if (Objects.equals(myContacts.get(i).getName(), name)) {
                return i;
            }
        }

        return -1;
    }

    public Contact queryContact(String name) {
        try {
            return myContacts.get(findContact(name));
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    public void printContacts() {
        int index = 1;
        System.out.println("Contact List:");
        for (Contact contact: myContacts) {
            System.out.printf("%s. %s -> %s\n", index, contact.getName(), contact.getPhoneNumber());
            index++;
        }

    }
}

