package com.company.goodcode;

import com.company.interfaces.Engine;
import com.company.interfaces.LowFuelIndicator;

//HeroHonda bike is from brand Honda.
//It will have some basic features incoming from the brand thus extending it from honda
public class HeroHonda extends Honda implements LowFuelIndicator
{
    private String handleBarType;

    public HeroHonda(Integer modelNo, Engine engine, String handleBarType)
    {
        super(modelNo, engine);
        this.handleBarType=handleBarType;
    }

    //As of now get method is not used but it might be used later so not removing it
    public String getHandleBarType()
    {
        return handleBarType;
    }

    //As of now set method is not used but it might be used later so not removing it
    public void setHandleBarType(String handleBarType)
    {
        this.handleBarType = handleBarType;
    }


    @Override
    public void lowFuelIndicator() {
        System.out.println("As per Hero honda's mileage the fuel is running out");
    }

    @Override
    public void getThereBySuperSpeed()
    {
        System.out.println("Ill take you there by Hero Honda.");
    }
}
