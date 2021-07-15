package com.company.ocp;

//Thus any other extentions to honda  is possible
public class HondaCity extends Honda{
    private String rooftopType;
    private boolean hasAC;
    private boolean automaticMode;

    @Override
    public void lowFuelIndicator() {
        System.out.println("As per Honda City's mileage the fuel is running out");
    }

    public void autoSpeed()
    {
        if(automaticMode)
            System.out.println("Honda City in auto driving mode");
    }

    @Override
    public void getThereBySuperSpeed()
    {
        System.out.println("Ill take you there by Honda City.");
    }

}
