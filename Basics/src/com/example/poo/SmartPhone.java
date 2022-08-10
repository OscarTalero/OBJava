package com.example.poo;

public class SmartPhone extends SmartDevice {

    String OS;
    boolean camera;

    public SmartPhone() {

    }

    public SmartPhone(String name, String manufacturer, String model, String screenSize, String OS, boolean camera) {
        super(name, manufacturer, model, screenSize);
        this.OS = OS;
        this.camera = camera;
    }

}
