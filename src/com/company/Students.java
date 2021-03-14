package com.company;

import java.util.PropertyPermission;
import java.util.Random;

public class Students extends Person {
    private int age;

    public Students(String name, String nationality, Profession profession, Enum anEnum,int age) {
        super(name, nationality, profession, anEnum);
        this.age = age;
    }

    @Override
    public final void findAge(int age, int year) {
        super.findAge(age, year);
    }

    public int getAge() {
        return age;
    }

}
