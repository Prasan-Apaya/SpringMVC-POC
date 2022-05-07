package com.first.test.models;

import com.first.test.models.Address;
import org.springframework.stereotype.Component;

@Component
public class Company {
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Company(Address address) {
        this.address = address;
    }
}

