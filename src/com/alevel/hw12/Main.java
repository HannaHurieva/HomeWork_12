package com.alevel.hw12;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Ivan");
        person.setAge(32);
        person.setGender('M');

        Person teacher = new Teacher("Sergey Trainer", 45, 'M', "Sport culture", 12000);
        Person student = new Student("Petr Pupkin", 21, 'M', "WRT546372", 4.8);
        Person collegeStudent = new CollegeStudent("Alisa French", 19, 'F', "HI5347173", 5, 2, "Chemistry");

        Person[] Persons = {person, teacher, student, collegeStudent,
                new Person("Coach Bob", 27, 'M'),
                new Student("Lynne Brooke", 16, 'F', "HS95129", 3.5),
                new Teacher("Duke Java", 34, 'M', "Computer Science", 50000.0),
                new CollegeStudent("Ima Frosh", 18, 'F', "UCB123", 4.0, 1, "English")};

        for (Person item : Persons) {
            System.out.println(item.toString());
        }
    }
}
