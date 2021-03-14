package com.company;

public final class Teacher extends Person{
    private String whichSubject;

    public Teacher(String name, String nationality, Profession profession, Enum anEnum,String whichSubject) {
        super(name, nationality, profession, anEnum);
        this.whichSubject = whichSubject;
    }


    public String getWhichSubject() {
        return whichSubject;
    }

    @Override
    public void findAge(int age, int year) {
        super.findAge(age,year);


    }

}
