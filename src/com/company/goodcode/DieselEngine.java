package com.company.goodcode;
import com.company.interfaces.Engine;

//The vehicle having diesel engine
public class DieselEngine implements Engine {

    @Override
    public void fillFuel() {
        System.out.println("Filled Diesel");
    }
}
