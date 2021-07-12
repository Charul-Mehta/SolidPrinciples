package com.company.goodcode;

import com.company.interfaces.AutomaticService;
import com.company.interfaces.Engine;
import com.company.interfaces.LowFuelIndicator;

//Honda City Car which is from brand Honda.
//It will have some basic features incoming from the brand thus extending it from honda
public class HondaCity extends Honda implements AutomaticService, LowFuelIndicator
{
    //Rooftop can be transparent or hard, specific to a car
    private String rooftopType;
    private boolean hasAC;
    private boolean automaticMode;

    public HondaCity(Integer modelNo, Engine engine, String rooftopType, boolean hasAC, boolean automaticMode) {
        super(modelNo, engine);
        this.hasAC=hasAC;
        this.rooftopType=rooftopType;
        this.automaticMode=automaticMode;
    }

    public String getRooftopType() {
        return rooftopType;
    }
    public boolean isHasAC() {
        return hasAC;
    }
    public boolean isAutomaticMode() {
        return automaticMode;
    }

    public void setAutomaticMode(boolean automaticMode) {
        this.automaticMode = automaticMode;
    }

    public void setHasAC(boolean hasAC) {
        this.hasAC = hasAC;
    }

    public void setRooftopType(String rooftopType) {
        this.rooftopType = rooftopType;
    }

    @Override
    public void autoSpeed()
    {
        if(automaticMode)
            System.out.println("Honda City in auto driving mode");
    }

    @Override
    public void chooseShortestRoute()
    {
        if(automaticMode)
            System.out.println("Yeah.. we are on the shortest route to destination");
    }

    @Override
    public void lowFuelIndicator() {
        System.out.println("As per Honda City's mileage the fuel is running out");
    }

    @Override
    public void getThereBySuperSpeed()
    {
        System.out.println("Ill take you there by Honda City.");
    }
}
