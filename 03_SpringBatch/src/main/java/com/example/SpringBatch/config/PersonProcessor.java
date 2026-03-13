package com.example.SpringBatch.config;

import com.example.SpringBatch.Entity.Person;
import org.springframework.batch.item.ItemProcessor;

public class PersonProcessor implements ItemProcessor<Person, Person> {

    @Override
    public Person process(Person person) throws Exception {
        person.setId(null);
        person.setFirstName(person.getFirstName().toUpperCase());
        person.setLastName(person.getLastName().toUpperCase());

        return person;
    }
}