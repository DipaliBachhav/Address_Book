package com.AddressBook;

import org.junit.Assert;
import org.junit.Test;

public class AddressBookTest {

    private final String FILE_PATH = "src/test/resources/PersonData.json";
    public final String CREATE_FILE = "addressBook";
    public final String ADD_RECORD = "addRecord";
    public final String DELETE_RECORD ="deleteRecord";

    @Test
    public void givenFilePath_WhenCreateNewFile_ThenReturnSuccessMessage() throws  AddressBookException {
        AddressBookMain main=new AddressBookMain();
        String result = main.addressBook(new Person(), FILE_PATH, CREATE_FILE);
        Assert.assertEquals("File Created Successfully", result);
    }

    @Test
    public void givenFilePath_WhenAddPersonRecord_ThenReturnSuccessMessage() throws AddressBookException {
        AddressBookMain main=new AddressBookMain();
        String result = main.addressBook(new Person("Dipali","Bachhav","Nashik","Maharashtra","422013"), FILE_PATH, ADD_RECORD);
        Assert.assertEquals("Add Records Successfully", result);
    }

    @Test
    public void givenRecordPosition_WhenDeleteRecord_ThenReturnDeletedMessage() throws AddressBookException {
        AddressBookMain main = new AddressBookMain();
        String position = "1";
        String result = main.addressBook(new Person(), FILE_PATH, DELETE_RECORD, position);
        Assert.assertEquals("Delete Record", result);
    }
}
