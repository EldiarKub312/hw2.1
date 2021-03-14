package com.company;

import java.util.PropertyPermission;
import java.util.Random;

public final class Students extends Teacher {
    private int age;

    public Students(String name, String nationality, Profession profession, Enum anEnum, String whichSubject) {
        super(name, nationality, profession, anEnum, whichSubject);
    }


    @Override
    public final void findAge(int age, int year) {
        super.findAge(age, year);
    }

    public int getAge() {
        return age;
    }

}
