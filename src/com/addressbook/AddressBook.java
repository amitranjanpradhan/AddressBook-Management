package com.addressbook;

public class AddressBook {
	public final String firstname, lastname;
    public final String address, city, state;
    public final String zip;
    public final String phoneNumber;
    public final String email;

    /**
     * This is a parameterized constructor having the given parameters.
     * @param firstname
     * @param lastname
     * @param address
     * @param city
     * @param state
     * @param zip
     * @param phonenumber
     * @param email
     */
    public AddressBook(String firstname, String lastname, String address, String city, String state, String zip, String phonenumber, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phonenumber;
        this.email = email;
    }

    /**
     * This printContactDetails method will print all the values given below.
     */
    public void printContactDetails() {
        System.out.println("Firstname : " + firstname);
        System.out.println("Lastname : " + lastname);
        System.out.println("Address : " + address);
        System.out.println("City : " + city);
        System.out.println("State : " + state);
        System.out.println("Zip : " + zip);
        System.out.println("PhoneNumber : " + phoneNumber);
        System.out.println("Email : " + email);
    }
/**
 * Here i have putted parameters for constructor to get output.
 */
    public static void main(String[]args) {
        System.out.println("Wellcome to Address Book Program!");
                AddressBook contact = new AddressBook("Amit Ranjan", "Pradhan", "Narsinghpur", "Cuttack", "Odisha", "754032", "6371912511", "amitranjanpradhan456@gmail.com");
                contact.printContactDetails();
    }
}