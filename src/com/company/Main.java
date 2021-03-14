package com.company;

public class Main {

    public static void main(String[] args) {

        Students students = new Students("Леонардо","DI.KAPRIO",new Profession("Programming "),Nationality.KYRGYZ,"Актер");
        students.getInfo();
        students.findAge(18,2021);

        System.out.println("-----------------------------------");

        Teacher teacher = new Teacher("Дуйшон","ON.KRUT",new Profession("Мугалим "),Nationality.KYRGYZ,"Кыргыз тили");
        teacher.findAge(42,1979);
        teacher.getInfo();

        System.out.println("-----------------------------------");

        Teacher teacher1 = new Teacher("Камила","PRINCESS",new Profession("Космонавтка "),Nationality.KYRGYZ,"КОСМОС");
        teacher1.findAge(42,1979);
        teacher1.getInfo();




    }
}
