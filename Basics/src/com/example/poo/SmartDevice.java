package com.example.poo;

public class SmartDevice {

    protected String name;
    protected String manufacturer;
    protected String model;
    protected String screenSize;

    public SmartDevice() {

    }

    public SmartDevice(String name, String manufacturer, String model, String screenSize) {

        this.name = name;
        this.manufacturer = manufacturer;
        this.model = model;
        this.screenSize = screenSize;
    }
}
