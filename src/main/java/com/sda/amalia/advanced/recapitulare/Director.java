package com.sda.amalia.advanced.recapitulare;

public class Director extends Professor  {

    public Director(int age, String name, Gender gender, double salary, String subject) {
        super(age, name, gender, salary, subject);
    }

    public Director(double salary, String subject) {
        super(salary, subject);
    }

   public void pay(double amount) {
        super.setSalary(amount*2); //folosim super ca ne folosim de clasa parinte, dar se poate si fara
   }
}
