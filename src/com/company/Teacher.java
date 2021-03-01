package com.company;

public class Teacher extends Students {
    private String name;


    public Teacher() {
    }

    public Teacher(String name,Person person) {
        this.name = name;
        super.getPerson(person);
    }

    public String getName(String sharik) {
        return name;
    }
    public String getInfo() {
        return super.getInfo() + "\nName = " + name + "\nPerson ";
    }

    public void getPerson() {
    }
}
