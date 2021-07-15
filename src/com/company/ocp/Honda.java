package com.company.ocp;

import com.company.interfaces.Engine;

//The features that are common
public abstract class Honda {
    private String registrationNo;
    private Integer modelNo;
    private Engine engine;
    private String color;
    private Integer mileage;

    public abstract void lowFuelIndicator() ;

    public void getThereBySuperSpeed()
    {
        System.out.println("Reached with a great speed");
    }
}
