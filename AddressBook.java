import java.util.Scanner;

public class AddressBook {

    public static void main(String[] args) {

        AddressBookOperations addressBookOperations = new AddressBookOperations();
        String action, contact;
        int selectedAction;
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1.Add\n" + "2.Delete\n" + "3.Search\n" + "4.Display");
            action = scanner.nextLine();
            selectedAction = Integer.parseInt(action);
            switch(selectedAction) {

                case 1 :
                    addressBookOperations.addContact();
                    break;

                case 2 :
                    System.out.println("Enter name: ");
                    contact = scanner.nextLine();
                    addressBookOperations.deleteContact(contact);
                    break;

                case 3 :
                    System.out.println("Enter name: ");
                    contact = scanner.nextLine();
                    addressBookOperations.searchContacts(contact);
                    break;

                case 4:
                    addressBookOperations.displayContacts();
                    break;

                default :
                    System.exit(0);
            }
        }
    }
}
