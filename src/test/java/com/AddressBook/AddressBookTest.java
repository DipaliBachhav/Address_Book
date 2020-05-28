package com.AddressBook;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class AddressBookTest {

    AddressBookMain main = new AddressBookMain();
    private final String FILE_PATH = "src/test/resources/PersonData.json";
    public final String CREATE_FILE = "addressBook";

    @Test
    public void givenFilePath_WhenCreateNewFile_ThenReturnSuccessMessage() throws IOException {
        String result = main.addressBook(new Person(), FILE_PATH, CREATE_FILE);
        Assert.assertEquals("File Created Successfully", result);
    }
}
