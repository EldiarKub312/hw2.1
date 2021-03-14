package com.company;

public class Person {

    private String name;
    private String nickName;
    private Profession profession;
    private Enum anEnum;


    public Person(String name, String nickName, Profession profession, Enum anEnum) {
        this.anEnum = anEnum;
        this.name = name;
        this.nickName = nickName;
        this.profession = profession;
    }

    public Enum getAnEnum(){
        return anEnum;
    }

    public String getName() {
        return name;
    }

    public String getNickName() {
        return nickName;
    }

    public Profession getProfession() {
        return profession;
    }

    public void findAge(int age, int year) {
        int findWasBorn = year - age;
        System.out.println("Год рождения: " + findWasBorn);
    }

    public final void findAge(int year, int wasBorn, double time) {
        int findAge = year - wasBorn;
        System.out.println(findAge);
    }

    public void findAge(double time, int year, int wasBorn) {
        int findAge = year - wasBorn;
        System.out.println(findAge);
    }

    public void getInfo() {
        System.out.println("Name: " + getName() + " \nНикнейм: " + getNickName()
                + " \nПрофессия: " + profession.getProfession()+ "\nНациональность: "+getAnEnum());
    }
}
