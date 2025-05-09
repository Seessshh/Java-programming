package com.sushil.Constructor;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students object ");
        int num = sc.nextInt();
        String a[];

        for (int i=1;i<=num;i++)
        {

            Student s=Student.createStudent();
            
            System.out.println(s);
        }
        for (int j = 1;j<=num;j++)
        {
            Student s = new Student();
            System.out.println(s);
        }
    }
}
