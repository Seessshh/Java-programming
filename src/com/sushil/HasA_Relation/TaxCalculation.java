package com.sushil.HasA_Relation;

public class TaxCalculation {

    static
    {
        System.out.println("Salary After the tax Calculation is : ");
    }

    public static void main(String[] args) {

        Employee e = new Employee(111,"Sushil",50000,5000,3250);
        System.out.println(TaxUtil.CalculateTax(e));

        Manager m =new Manager(222,"Ram",75000,8000,6523,10000);
        System.out.println(TaxUtil.CalculateTax(m));

        Trainer t = new Trainer(333,"Shyam",41000,4500,1525,4,2500);
        System.out.println(TaxUtil.CalculateTax(t));

        Sourcing s =new Sourcing(444,"Radha",15000,4520,1526,10,3,3200);
        System.out.println(TaxUtil.CalculateTax(s));

    }
}
