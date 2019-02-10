package com.alevel.hw12;

public class Teacher extends Person {
    private String subject; // e.g. "Computer Science", "Chemistry", "English", "Other"
    private double salary; // the amount the teacher earns

    public Teacher(String name, int age, char gender, String subject, double salary) {
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", subject: " + subject +
                ", salary: " + salary;
    }
}
