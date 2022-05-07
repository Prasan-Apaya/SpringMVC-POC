package com.first.test.models;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Address(Person person) {
        this.person = person;
    }
}
