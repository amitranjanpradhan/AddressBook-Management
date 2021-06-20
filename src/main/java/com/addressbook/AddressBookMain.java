package com.addressbook;

import com.opencsv.exceptions.CsvException;
import java.io.IOException;

/**
 * Added AddressBookmain class to create object of implemented class.
 */
public class AddressBookMain {
    public static void main(String[] args) throws IOException, CsvException {
        AddressBookImplement bookBuilder=new AddressBookImplement();
        bookBuilder.makechoice();
        boolean conditon=true;
        while (conditon) {
            boolean condition = bookBuilder.makechoice();
            if (condition == false)
                break;
        }
    }
}
