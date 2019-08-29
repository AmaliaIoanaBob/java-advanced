package com.sda.amalia.advanced.recapitulare;

import java.util.List;

public class Student extends Person {

    private List<Integer> grades;

    public Student(int age, String name, Gender gender, List<Integer> grades) {
        super(age, name, gender);
        this.grades = grades;
    }

    public Student(List<Integer> grades) {
        this.grades = grades;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grades=" + grades + "age="+ super.toString() +
                '}';
    }
}
