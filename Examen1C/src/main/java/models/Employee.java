package models;

import interfaces.Employable;

public abstract class Employee implements Employable {
    protected String id;
    protected String firstName;
    protected String lastName;
    protected int age;
    protected double baseSalary;

    public Employee(String id, String firstName, String lastName, int age, double baseSalary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateNetSalary();
}