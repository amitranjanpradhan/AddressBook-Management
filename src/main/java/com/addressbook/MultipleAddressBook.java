package com.addressbook;

import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.IOException;

/**
 * this is an interface where i have added the required methods.
 */
public interface MultipleAddressBook {
    public void addAddressBook(String BookName, String FirstName, String LastName, String Address, String City,
                               int Zip, String State, long PhoneNumber, String Email);
    public void getContact();
    boolean equals(String firstName);
    public void editContact();
    public void deleteEntry();
    public boolean makechoice() throws CsvException, IOException;
    public void writeAddressBookInFiles(AddressBookImplement.IOService ioService);
    public void readAddressBookInFiles(AddressBookImplement.IOService ioService);
    public void writeAddressBookInCSV() throws CsvRequiredFieldEmptyException, IOException, CsvDataTypeMismatchException;
    public void readAddressBookInCSV() throws IOException, CsvException;
}
