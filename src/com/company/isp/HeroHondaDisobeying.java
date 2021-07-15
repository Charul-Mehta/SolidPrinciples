package com.company.isp;

public class HeroHondaDisobeying implements HondaInterface
{
    //Cannot be implemented in HeroHonda. Thus not obeying ISP. And we will segregate the interface in such a manner that no
    @Override
    public void autoSpeed()
    {
        System.out.println("Cannot be Implemented");
    }

    //Cannot be implemented in HeroHonda thus not following LSP
    @Override
    public void chooseShortestRoute()
    {
        System.out.println("Cannot be Implemented");
    }

    @Override
    public void lowFuelIndicator() {
        System.out.println("As per Honda City's mileage the fuel is running out");
    }
}
