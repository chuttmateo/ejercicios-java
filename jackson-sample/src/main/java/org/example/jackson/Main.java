package org.example.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.jackson.domain.Person;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("laptop", 1);
        map.put("car", 1);
        Person p = new Person("Mateo", "Chutt", LocalDate.now(), map);

        serialize(p, "target/person.json");
        Person person = deserialize("target/person.json");
        System.out.println(person);

    }
    public static void serialize(Person person, String path){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File(path), person);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static Person deserialize(String path){
        ObjectMapper objectMapper = new ObjectMapper();
        Person person = null;
        try {
            person = objectMapper.readValue(new File(path), Person.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return person;
    }
}
