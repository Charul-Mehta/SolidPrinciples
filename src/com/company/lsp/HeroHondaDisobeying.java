package com.company.lsp;

import jdk.jshell.spi.ExecutionControl;

public class HeroHondaDisobeying implements HondaInterface
{
    //Cannot be implemented in HeroHonda thus not following LSP
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
