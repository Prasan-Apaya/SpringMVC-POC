package com.first.test;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Greeting {
    private String content;
    int id;

    public Greeting(String content, int id) {
        this.content = content;
        this.id = id;
    }
}
