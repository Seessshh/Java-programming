package com.sushil.Scenario_based_programs;

public class CalculateStudentGrade {

    public static StudentGrade calculateGrade(Student student)
    {
        int marks = student.getMarks();

        if (marks>90)
            return new StudentGrade(student,'A');
        else if (marks>=75 && marks <90)
            return new StudentGrade(student,'B');
        else if (marks>=60 && marks <75)
            return new StudentGrade(student,'C');
        else
            return new StudentGrade(student,'D');

    }
}
