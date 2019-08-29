package com.sda.amalia.advanced.recapitulare;

public class Professor extends Person implements Payable{
    private double salary;
    private String subject; // ce materie preda

    public Professor(int age, String name, Gender gender, double salary, String subject) {
        super(age, name, gender);
        this.salary = salary;
        this.subject = subject;
    }

    public Professor(double salary, String subject) {
        this.salary = salary;
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "salary=" + salary +
                ", subject='" + subject + '\'' +
                "age=" + getAge() +
                ", name='" + getName() + '\'' +
                ", gender=" + getGender() +
                '}';
    }

    public void pay(double amount) {
       // salary = amount; //ambele variante sunt corecte pentru salariu
        this.salary = amount;

    }
}
