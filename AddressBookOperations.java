import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookOperations {

    private ArrayList<ContactInfo> contacts;

    public AddressBookOperations() {
        contacts = new ArrayList();
    }

    public void addContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter address : ");
        String address = scanner.nextLine();
        System.out.println("Enter city: ");
        String city = scanner.nextLine();
        System.out.println("Enter state: ");
        String state = scanner.nextLine();
        System.out.println("Enter zip: ");
        String zip = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        ContactInfo info = new ContactInfo(firstName, lastName, address, city, state, zip, phoneNumber);
        contacts.add(info);
        System.out.println("Contact added!");
    }

    public void deleteContact(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            ContactInfo info = contacts.get(i);
            if ( name.equals(info.firstName) ) {
                contacts.remove(i);
            }
        }
        System.out.println("Contact " + name + " deleted!");
    }

    public void searchContacts(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            ContactInfo info = contacts.get(i);
            if (name.equals(info.firstName)) {
                info.display();
            }
        }
    }

    public void displayContacts() {
        if (contacts.size() == 0) {
            System.out.println("Address book has no contacts.");
        } else {
            for (int i = 0; i < contacts.size(); i++) {
                ContactInfo info = contacts.get(i);
                System.out.print("Contact " + i);
                info.display();
            }
        }
    }
}
