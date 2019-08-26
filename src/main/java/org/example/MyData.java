package org.example;

import org.springframework.data.annotation.Id;

class MyData {

    @Id
    public String id;
    private String text;

    MyData(){}

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return String.format("MyData[id=%s, text='%s']", id, text);
    }
}
