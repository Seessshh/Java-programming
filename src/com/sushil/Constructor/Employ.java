package com.sushil.Constructor;

public class Employ {
    public static void main (String[] args)
    {
        EmployeeeBlc e = new EmployeeeBlc("shatiman",30,"sales",50000,"good");
        System.out.println("Salary after increase : "+e.updateSalary());
        EmployeeeBlc e1 =new EmployeeeBlc("Adib",26,"developer",35000,"average");
        System.out.println("Salary after increase : "+e1.updateSalary());
        EmployeeeBlc e2 = new EmployeeeBlc("Ayush",25,"tester",45000,null);
        System.out.println("Salary of after increase : "+e2.updateSalary());
    }
}
