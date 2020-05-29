package com.AddressBook;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AddressBook implements AddressBookInterface {
    @Override
    /*public String addPersonRecord() {
        return null;
    }*/
            File file;
            ObjectMapper mapper = new ObjectMapper();

    public String addPersonRecord(Person person, String file_path) {
        try {
            File file = new File(file_path);
            FileWriter printWriter = new FileWriter(file,true);
            ObjectMapper mapper = new ObjectMapper();
            String jsonString = mapper.writeValueAsString(person.toString());
            printWriter.write(jsonString);
            printWriter.flush();
            return "Add Records Successfully";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void saveRecord(List<Person> list) throws IOException {
        mapper.writeValue(file, list);
    }

    public List readFile(String file_path) throws IOException {
        FileReader file = new FileReader(new File(file_path));
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(file);
        List list = new ArrayList();
        list.add(jsonNode);
        return list;
    }

}