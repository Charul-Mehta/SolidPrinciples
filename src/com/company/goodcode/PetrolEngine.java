package com.company.goodcode;
import com.company.interfaces.Engine;

//The vehicle having petrol engine
public class PetrolEngine implements Engine {

    @Override
    public void fillFuel() {
        System.out.println("Filled Petrol");
    }

}
