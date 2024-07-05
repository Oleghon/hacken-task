package com.hacken.ocherepnin.test_task.util;

import com.hacken.ocherepnin.test_task.domain.Pet;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class LocalCSVParser {

    public static List<Pet> parse(String file) throws IOException {
        List<Pet> parsedData = new ArrayList<>();

            StringReader reader = new StringReader(file);
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader());

            for (CSVRecord csvRecord : csvParser) {
                String name = csvRecord.get("Name");
                String breed = csvRecord.get("Breed");
                String desc = csvRecord.get("Description");
                int age = Integer.parseInt(csvRecord.get("Age"));
                int weight = Integer.parseInt(csvRecord.get("Weight"));

                Pet pet = new Pet(name, breed, age, weight, desc);
                parsedData.add(pet);
            }
        return parsedData;
    }
}
