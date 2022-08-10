package com.example.poo;

public class SmartWatch extends SmartDevice{

    int bateryDays;

    public SmartWatch(){

    }

    public SmartWatch(int bateryDays, String name, String manufacturer, String model, String screenSize){

        super(name, manufacturer, model, screenSize);
        this.bateryDays = bateryDays;
    }
}
