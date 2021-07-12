package com.company.goodcode;

import com.company.interfaces.Engine;
import com.company.interfaces.LowFuelIndicator;


//Its the brand of cars and bikes
public abstract class Honda implements LowFuelIndicator
{
    private String registrationNo;
    private Integer modelNo;
    private Engine engine;
    private String color;
    private Integer mileage;

    //Constructor
    public Honda(Integer modelNo, Engine engine) {
        this.modelNo=modelNo;
        this.engine=engine;
    }

    ///Getters
    public String getRegistrationNo() {
        return registrationNo;
    }
    public Integer getModelNo() {
        return modelNo;
    }
    public Engine getEngine() {
        return engine;
    }
    public String getColor() {
        return color;
    }
    public Integer getMileage() {
        return mileage;
    }

    ///Setters
    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public void setModelNo(Integer modelNo) {
        this.modelNo = modelNo;
    }
    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public abstract void lowFuelIndicator() ;

    public void getThereBySuperSpeed()
    {
        System.out.println("Reached with a great speed");
    }
}
