package com.company.dip;

public class HondaDisobeying {
    private String registrationNo;
    private Integer modelNo;
    private com.company.dip.Engine engine;
    private String color;
    private Integer mileage;

    //Violating the dip
    //Tightly coupled classes. Instead we can make them loosely coupled by passing in constructor as an Interfece
    public HondaDisobeying() {
        this.engine=new Engine();
    }
}
