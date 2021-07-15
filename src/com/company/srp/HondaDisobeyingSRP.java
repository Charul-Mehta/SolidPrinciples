package com.company.srp;

public class HondaDisobeyingSRP
{
    public void getCarPrice(){
        System.out.println("It is 100 Bucks");
    }

    //Here the class is having more than one responsibilities so splitting up one class into to class
    public void fillFuel(){
        System.out.println("Filled fuel");
    }
}
