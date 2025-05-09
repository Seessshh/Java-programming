package com.sushil.Constructor;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String grade;

    public static Student createStudent()
    {
        Student s = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the Student ");
         s.name = sc.nextLine();
        System.out.println("Enter the age of the student ");
        s.age = sc.nextInt();
        System.out.println("Enter the grade of the student ");
        s.grade = sc.nextLine();
        s.grade = sc.nextLine();

        return s;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade='" + grade + '\'' +
                '}';
    }
}
