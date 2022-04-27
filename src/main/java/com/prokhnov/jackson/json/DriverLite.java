package com.prokhnov.jackson.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class DriverLite {
    public static void main(String[] args) {

        try {
            // create ObjectMapper
            ObjectMapper mapper = new ObjectMapper();

            // read JSON file and map/convert to POJO
            StudentLite myStudentLite = mapper.readValue(new File("data/sample-lite.json"), StudentLite.class);

            // print first name and last name
            System.out.println("First Name: " + myStudentLite.getFirstName());
            System.out.println("Last Name: " + myStudentLite.getLastName());

        }catch (Exception exc){
            exc.printStackTrace();
        }

    }
}
