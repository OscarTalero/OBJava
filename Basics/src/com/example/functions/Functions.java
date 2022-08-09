package com.example.functions;

public class Functions {

    public static void main(String[] args) {

        int precio = 100;
        System.out.println("El valor total es: " + valorTotal(precio));
    }

    public static float valorTotal (int precio) {

        float total;
        float iva = 0.16f;
        return total = precio + (precio * iva);

    }
}
