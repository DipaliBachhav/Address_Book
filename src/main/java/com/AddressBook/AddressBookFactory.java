package com.AddressBook;

public class AddressBookFactory {
    public static IAddressBookController createControllerInterface() {
        return new AddressBookController();
    }

    public static AddressBookInterface createAddressBookInterface() {
        return new AddressBook() {
            @Override
            public String addPersonRecord(Person person, String file_path) {
                return null;
            }

        };

    }
}
