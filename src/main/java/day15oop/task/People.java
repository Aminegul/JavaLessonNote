package day15oop.task;

import java.sql.SQLOutput;

public class People {

    public static void main(String[] args) {

        Person amyGul = new Person("Amine" , 26, "Female");

        Student burhan = new Student("Burhan", 33, "Male", 58, "IT", "A", "B");

        System.out.println(amyGul);
        System.out.println(burhan);

        System.out.println(amyGul.getAge());
        amyGul.setName("Aminegül");
        System.out.println(amyGul.getName());




        int amyGulAge = amyGul.getAge();  // amyGül'ün age i için variable oluşturduk.

        int burhanAge = burhan.getAge();

        String burhanName = burhan.getName();


    }

}
