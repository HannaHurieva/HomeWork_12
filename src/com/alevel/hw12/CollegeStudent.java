package com.alevel.hw12;

public class CollegeStudent extends Student {
    private int year; // current level in college
    private String major;

    public CollegeStudent(String name, int age, char gender, String idNumber, double gpa, int year, String major) {
        super(name, age, gender, idNumber, gpa);
        this.year = year;
        this.major = major;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", year: " + year +
                ", major: " + major;
    }
}
