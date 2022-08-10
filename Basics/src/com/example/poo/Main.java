package com.example.poo;

public class Main {

    public static void main(String[] args) {

        SmartPhone smartPhone1 = new SmartPhone("Switch", "Xiaomi", "MI11", "6'",
                "Android", true);
        System.out.println("Specifications for SmartPhone");
        System.out.println(smartPhone1.name);
        System.out.println(smartPhone1.manufacturer);
        System.out.println(smartPhone1.model);
        System.out.println(smartPhone1.screenSize);
        System.out.println(smartPhone1.OS);
        System.out.println(smartPhone1.camera);


        SmartWatch smartWatch1 = new SmartWatch(15, "GT1", "Realme", "GT1","2'");
        System.out.println("Specifications for SmartWatch");
        System.out.println(smartWatch1.name);
        System.out.println(smartPhone1.manufacturer);
        System.out.println(smartPhone1.model);
        System.out.println(smartPhone1.screenSize);
        System.out.println(smartWatch1.bateryDays);

    }
}
