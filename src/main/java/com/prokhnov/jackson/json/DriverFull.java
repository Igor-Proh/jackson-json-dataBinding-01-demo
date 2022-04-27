package com.prokhnov.jackson.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class DriverFull {
    public static void main(String[] args) {

        try {
            // create ObjectMapper
            ObjectMapper mapper = new ObjectMapper();

            // read JSON file and map/convert to POJO
            StudentFull myStudentFull =
                    mapper.readValue(new File("data/sample-full.json"),
                            StudentFull.class);

            // print Student
            System.out.println("\n>>> Student: " + myStudentFull.toString());

            // print Address
            Address myAddress = myStudentFull.getAddress();
            System.out.println("\n>>> Address: " + myAddress.toString());

            // print languages
            System.out.println("\n>>> Languages:");
            int count = 1;
            for (String x :myStudentFull.getLanguages()){
                System.out.println(count + ". " + x);
                count++;
            }

        }catch (Exception exc){
            exc.printStackTrace();
        }

    }
}
