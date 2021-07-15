package com.company.dip;

import com.company.interfaces.Engine;

public class Honda {
    private String registrationNo;
    private Integer modelNo;
    private com.company.interfaces.Engine engine;
    private String color;
    private Integer mileage;

    //Making Engine Loosely coupled
    public Honda(Integer modelNo, Engine engine) {
        this.modelNo=modelNo;
        this.engine=engine;
    }
}
