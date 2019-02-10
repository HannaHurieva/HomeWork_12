package com.alevel.hw12;

public class Student extends Person {
    protected String idNumber;
    protected double gpa;

    public Student(String name, int age, char gender, String idNumber, double gpa) {
        super(name, age, gender);
        this.idNumber = idNumber;
        this.gpa = gpa;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", idNumber: " + idNumber +
                ", gpa: " + gpa;
    }
}
