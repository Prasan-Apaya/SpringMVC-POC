package com.first.test.models;

import org.springframework.stereotype.Component;


public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    private String name;

}
