package com.company.ocp;

import com.company.interfaces.Engine;

//If we want to add any other car or bike having some features of this it is not possible. So all the common things we will be keeping in a single class
//That way it will be easy to extend the features
public class HondaCityDisobeyingocp {
    //Method common to all the bikes and cars
    private String registrationNo;
    private Integer modelNo;
    private Engine engine;
    private String color;
    private Integer mileage;

    //Rooftop can be transparent or hard, specific to a car
    private String rooftopType;
    private boolean hasAC;
    private boolean automaticMode;

    //Method specific to honda city
    public void autoSpeed()
    {
        if(automaticMode)
            System.out.println("Honda City in auto driving mode");
    }

    //Method specific to honda city
    public void chooseShortestRoute()
    {
        if(automaticMode)
            System.out.println("Yeah.. we are on the shortest route to destination");
    }

    //Method for common bikes and cars
    public void lowFuelIndicator() {
        System.out.println("As per Honda City's mileage the fuel is running out");
    }

    public void getThereBySuperSpeed()
    {
        System.out.println("Ill take you there by Honda City.");
    }
}
