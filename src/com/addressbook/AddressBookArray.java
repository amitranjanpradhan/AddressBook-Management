package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Added AddressbookArray class to add an arraylist code in it.
 * Here i modified the access of the Contactlist to protected.
 * Because protected objects can be accessed in inner classes.
 */
public class AddressBookArray {
    Scanner sc=new Scanner(System.in);
    protected ArrayList<AddressBook> contactList = new ArrayList<AddressBook>();
    String addressBookName;
  }
