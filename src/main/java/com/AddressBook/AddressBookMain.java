package com.AddressBook;



public class AddressBookMain {

    public String addressBook(Person person, String file_path, String choice) throws AddressBookException {
        IAddressBookController controller = AddressBookFactory.createControllerInterface();
        AddressBookInterface addressBook=AddressBookFactory.createAddressBookInterface();
            switch (choice) {
            case "addressBook":
                return controller.createNewAddressBook(file_path);
                case "addRecord":
                    return addressBook.addPersonRecord();
            default: {
                throw new AddressBookException(AddressBookException.Exception_Type.WRONG_CHOICE, "Enter Right Choice");
            }
        }
    }
}


