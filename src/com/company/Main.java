package com.company;

import com.company.goodcode.*;
import com.company.interfaces.LowFuelIndicator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        Honda car=new HondaCity(002, new DieselEngine(), "Open", true, true);
        car.setColor("Red");
        car.setMileage(30);
        System.out.println(car.getModelNo());
        car.getEngine().fillFuel();

        System.out.println("\n");
        System.out.println("Bike:");
        Honda bike= new HeroHonda(003, new PetrolEngine(),"Original Handle");
        car.setColor("black");
        car.setMileage(45);
        bike.getEngine().fillFuel();

        System.out.println("\n");
        List<LowFuelIndicator> list= new ArrayList<LowFuelIndicator>();
        list.add(new HondaCity(002, new DieselEngine(), "Open", true, true));
        list.add(new HeroHonda(003, new PetrolEngine(),"Original Handle"));

        for (LowFuelIndicator ls:list)
        {
            ls.lowFuelIndicator();
        }

        System.out.println("\n");

        //An example for Liskov substitution principle
        TravelService travelService=new TravelService();
        travelService.letMeTravel(car);

    }
}
