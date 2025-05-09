package com.sushil.Scenario_based_programs;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of the Student : ");
        String name = sc.nextLine();
        System.out.print("Enter the marks of the Student : ");
        int marks = sc.nextInt();

        Student s = new Student(name,marks);
        StudentGrade sg =CalculateStudentGrade.calculateGrade(s);
        System.out.println(sg);
        sc.close();
    }
}
