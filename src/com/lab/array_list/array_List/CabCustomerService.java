package com.lab.array_list.array_List;

import com.lab.array_list.array_List.CabCustomer;

import java.util.ArrayList;

public class CabCustomerService
{
    private ArrayList<CabCustomer> customer= new ArrayList<>();

    public CabCustomer addCabCustomer(CabCustomer c)
    {
       if (isFirstCustomer(c))
       {
           customer.add(c);

       }
       else {
           System.out.println("Customer already exists");
       }
        return c;
    }

    public boolean isFirstCustomer(CabCustomer c)
    {
        for(CabCustomer customers : customer)
        {
            if (customers.getPhone().equals(c.getPhone()))
            {
                return false;
            }
        }

        return true;
    }

    public double calculateBill(CabCustomer c)
    {
        if (isFirstCustomer(c))
        {
            return 0;
        }
        if ( c.getDistance()<=4)
        {
            return 80d;
        }
        else
        {
            return 80 + (c.getDistance()*6);
        }



    }
    public void printBill(CabCustomer c)
    {
        System.out.println(c.getCustomerName()+" Please pay your bill of Rs."+calculateBill(c));
    }
}
