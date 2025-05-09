package com.sushil.Inheritance;

public class Student {

    int studentId;
    String name;
    double examfee;
    double payAmount;


    public Student(int studentId, String name, double examfee) {
        this.studentId = studentId;
        this.name = name;
        this.examfee = examfee;
        this.payAmount = payAmount;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", examfee=" + examfee +
                '}';
    }

    public String displayDetails()
    {
        return toString();
    }

    public double payFee()
    {
        return examfee;
    }
}
