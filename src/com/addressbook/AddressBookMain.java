package com.addressbook;
import java.util.Scanner;
/**
 * Added AddressBookmain class to create object of Main class.
 */
public class AddressBookMain {
    private void choice() {
        boolean result = true;
        Scanner input = new Scanner(System.in);
        AddressBookArray addressBook = new AddressBookArray();

        /**
         * switch case for each cases to be performed
         * According to the options it'll call the method.
         */
        while(result) {
            System.out.println("Enter option to make changes : \n[*press 1 to add new Contact."
                                                                +"\n*press 2 to Edit existing contacts."
                                                                +"\n*press 3 to delete a contact detail."
                                                                +"\n*press 4 to search by city."
                                                                +"\n*press 5 to search by State."
                                                                + "\n*press 0 to quit ]");
            int option = input.nextInt();
            switch (option) {
                case 1 :
                    addressBook.addContact();
                    break;
                case 2 :
                    System.out.println("Enter your firstname to Edit your details..");
                    String firstname = input.next();
                    addressBook.editContact(firstname);
                    break;
                case 3 :
                    System.out.println("Enter your Firstname to delete your details :");
                    String firstName = input.next();
                    addressBook.deleteContact(firstName);
                    break;
                case 4:
                    System.out.println("Enter your City name to search Person details: ");
                    String city=input.next();
                    addressBook.searchPersonByCity(city);
                    break;
                case 5:
                    System.out.println("Enter your State name to search person details: ");
                    String state=input.next();
                    addressBook.searchPersonByState(state);
                    break;
                default:
                    result = false;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book");
        /**
         * Here i have created an object of Address book class with the parameters
         * it will assign inside the constructor and initialised too.
         */
        AddressBook addressBook = new AddressBook("Amit Ranjan", "Pradhan", "Narsinghpur",
        		"Cuttack", "Odisha", 754032, 637191251, "amitranjanpradhan456@gmail.com");
        addressBook.printContactDetails();
        /**
         * Here i have created one object of AddressBookMain class named main.
         * which will call the choice method to execute all the functions.
         */
        AddressBookMain main = new AddressBookMain();
        main.choice();
    }
}