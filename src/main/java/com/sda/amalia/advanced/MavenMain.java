package com.sda.amalia.advanced;

import com.sda.amalia.advanced.recapitulare.*;
import org.apache.commons.lang3.StringUtils;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class MavenMain {

    public static void main(String[] args) {

        Person person = new Person(22, "Didi", Gender.FEMALE);
        System.out.println(person);


        Person didi2 = new Person();
        didi2.setAge(22);
        didi2.setName("Didi");
        didi2.setGender(Gender.FEMALE);

        System.out.println(didi2);

        Professor professor = new Professor(35, "Paul", Gender.MALE, 7500, "Java");

        List<Integer> studentGrades = new ArrayList<>();
        studentGrades.add(7);
        studentGrades.add(9);
        studentGrades.add(10);
        Student student = new Student (32, "Amalia", Gender.FEMALE, studentGrades);

        System.out.println(student);

        Director director = new Director(55, "Andrei", Gender.MALE, 0, "Informatica");
        Professor prof = new Professor(37,"Radu", Gender.MALE, 0, "Chimie");

        director.pay(2000);
        prof.pay(1000);

        System.out.println(director.getSalary());
        System.out.println(prof.getSalary());

        if (person.equals(didi2)) {
            System.out.println("Are equal");
        } else {
            System.out.println("Not equal");
        }



        String name = "   ";


        System.out.println(name.isEmpty());

       boolean isBlank = StringUtils.isBlank(name); //is blank (este ceva intre ghilimele, dar e gol, exemplu spatiul dintre ghilimele)
        System.out.println(isBlank);
    }
}
