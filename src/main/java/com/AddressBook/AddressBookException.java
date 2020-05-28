package com.AddressBook;

public class AddressBookException  extends Exception{
    public enum Exception_Type{
        WRONG_CHOICE,FILE_ALREADY_EXISTS;
    }
    Exception_Type type;

    public AddressBookException(Exception_Type type,String message) {
        super(message);
        this.type = type;
    }
}
