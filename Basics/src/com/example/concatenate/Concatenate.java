package com.example.concatenate;

public class Concatenate {

    public static void main(String[] args) {

        String[] names = {"Karla", "Juanita", "Ximena", "Paloma"};
        System.out.println(joinText(names));
    }

    public static String joinText(String[] names) {

        String result = "";
        for (String name : names) {
            result = result + " " + name;
        }
        return result;
        
    }
}
