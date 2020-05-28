package com.AddressBook;

import java.io.File;

public class AddressBookController implements IAddressBookController {

        @Override
        public String createNewAddressBook(String fileName) {
            try {
                File file = new File(fileName);
                if (file.exists() == true)
                    return "File already exists";
                else file.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "File Create Successfully";
        }

    }
