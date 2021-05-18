package com.addressbook;

import java.util.ArrayList;
/**
 * Added AddressbookArray class to add an arraylist code in it.
 */
public class AddressBookArray {
    private ArrayList<AddressBook> contactList = new ArrayList<AddressBook>();

    public void insertContact(AddressBook contactDetailObject) {
        contactList.add(contactDetailObject);
    }
}