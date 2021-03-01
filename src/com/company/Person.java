package com.company;

public class Person {

    private String name;
    private String Nationality;

    public Person(String name, String nationality, int age) {
        this.name = name;
        Nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return Nationality;
    }
}
