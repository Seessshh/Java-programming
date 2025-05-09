package com.lab.array_list.array_List;

import com.lab.array_list.array_List.CabCustomer;
import com.lab.array_list.array_List.CabCustomerService;

public class CabCustomerServiceTester
{
    public static void main(String[] args) {

        CabCustomerService service = new CabCustomerService();


        CabCustomer c1 = new CabCustomer(101,"Sushil","Ameerpet","Begumpet",15,"9226087295");
        CabCustomer c2 = new CabCustomer(102,"Sanket","Latur","Pune",350,"9309720084");
        CabCustomer c3 = new CabCustomer(103,"Adib","Ameerpet","NareshIt",4,"7895489562");

       service.addCabCustomer(c1);
       service.addCabCustomer(c2);
       service.addCabCustomer(c3);


        service.printBill(c1);
        service.printBill(c2);
        service.printBill(c3);


    }
}
