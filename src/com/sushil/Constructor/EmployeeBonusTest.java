package com.sushil.Constructor;

public class EmployeeBonusTest {
    public static void main(String[] args) {
        EmployeeBonus e = new EmployeeBonus("Adib",35000,4);
        System.out.println(e);
      Bonus e1= Bonus.calculateBonus(e);
        System.out.println("Bonus Amount : "+e1.getBonusAmount()+"% of basic salary");
    }
}
