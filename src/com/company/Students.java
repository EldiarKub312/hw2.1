package com.company;

import java.util.Random;

public class Students {
    private int age = generateDefaultAge();
    private Person person;

    public int getAge() {
        return age;
    }

    public Person getPerson(Person person) {
        return this.person;
    }


    private int generateDefaultAge() {
        return new Random().nextInt(20)+1;
    }

    public String getInfo(){
        return "Age = "+age+"\nPerson = "+person;
    }
}
