package com.addressbook;

import java.util.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AddressBookFileIO {
    public void writeData(List<AddressBook> addressBook){
        StringBuffer addressBookBuffer = new StringBuffer();
        addressBook.forEach(employee ->{
            String empDataString = employee.toString().concat("\n");
            addressBookBuffer.append(empDataString);
        });
        try {
            Files.write(Paths.get("AddressBook.txt"),addressBookBuffer.toString().getBytes());
        }catch (IOException x){
            x.printStackTrace();
        }
    }

    public List<AddressBook> readData() {
        List<AddressBook> addressBookList = new ArrayList<AddressBook>();

        try {
            Files.lines(new File("AddressBook.txt").toPath())
                    .map(line -> line.trim())
                    .forEach(line -> System.out.println(line));
        }catch (IOException x){
            x.printStackTrace();
        }
        return addressBookList;
    }
}
