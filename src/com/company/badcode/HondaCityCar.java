package com.company.badcode;

public class HondaCityCar
{
    //Rooftop can be transparent or hard, specific to a car
    private String rooftopType;
    private boolean hasAC;
    private boolean automaticMode;
    private Integer modelNo;
    private String engine;
    private String color;
    private Integer mileage;

    public HondaCityCar(Integer modelNo, String engine, String rooftopType, boolean hasAC, boolean automaticMode) {
        this.modelNo=modelNo;
        this.engine=engine;
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

    public Integer getModelNo() {
        return modelNo;
    }
    public String Engine() {
        return engine;
    }
    public String getColor() {
        return color;
    }
    public Integer getMileage() {
        return mileage;
    }


    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    public void setModelNo(Integer modelNo) {
        this.modelNo = modelNo;
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

    public void autoSpeed()
    {
        if(automaticMode)
            System.out.println("Honda City in auto driving mode");
    }

    public void chooseShortestRoute()
    {
        if(automaticMode)
            System.out.println("Yeah.. we are on the shortest route to destination");
    }

    public void fillFuel() {
        System.out.println("Filled Diesel");
    }
}
