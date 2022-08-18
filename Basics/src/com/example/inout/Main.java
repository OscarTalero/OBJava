package com.example.inout;


import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        String[] names = new String[]{"Bruno", "Peter", "Tony"};

        System.out.println("1. Array  *****");
        for (String name : names) {
            System.out.println(name);
        }

        String[][] names2 = {
                {"Bruno", "Diaz", "Batman"},
                {"Peter", "Parker", "Spiderman"}
        };

        System.out.println("2. Array Bidimensional *****");
        for (int i = 0; i < names2.length; i++) {
            System.out.println("Fila No.: " + i);
            for (int j = 0; j < names2[i].length; j++) {
                System.out.println(" Columna No.: " + j);
                System.out.println("  Valor: " + names2[i][j]);
            }
        }

        Vector<String> names3 = new Vector<String>();
        names3.add("Iron Man");
        names3.add("Spiderman");
        names3.add("Batman");
        names3.add("Superman");
        names3.add("Hulk");

        System.out.println("3. Vector *****");
        System.out.println("Vector dates: " + names3);

        names3.remove("Batman");
        names3.remove("Superman");

        System.out.println("Vector dates: " + names3);

        /**
         * 1000 elementos en un vector es una operacion que consume muchos recursos
         * 1000 / 10 = 100 se realizarian 100 operacion de creacion, y copiado
         *
        */

        System.out.println("4. ArrayList *****");

        ArrayList<String> namesList = new ArrayList<String>();
        namesList.add("Iron Man");
        namesList.add("Batman");
        namesList.add("Superman");
        namesList.add("Hulk");

        System.out.println("ArrayList dates: ");
        for (Object object : namesList.toArray()) {
            System.out.println(object.toString());
        }

        System.out.println("LinkedList dates: ");
        LinkedList<String> linkedNames = new LinkedList<String>(namesList);

        for (Object object : linkedNames.toArray()) {
            System.out.println(object.toString());
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> newList = new ArrayList<Integer>();

        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        for (int i = 0; i < 10; i++) {
            if (list.get(i) % 2 != 0) {
                newList.add(list.get(i));
            }
        }

        for (Object object : newList.toArray()) {
            System.out.println(object.toString());
        }

        System.out.println("5. Errors *****");

        try {
            DividePorCero(2, 0);
        } catch (Exception e) {
            System.out.println("Esto no puede hacerse");
        }
        finally {
            System.out.println("Demo de código");
        }

        System.out.println("5. In-Out ********");

        String fileIn = "/etc/hosts";
        String fileOut = "final.txt";
        try {
            CopyFile(fileIn, fileOut);
        } catch (Exception e) {
            System.out.println("Esto no puede hacerse");
        }

        //    Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.

        String fileHostIn = "/etc/hosts";
        String fileHostOut = "finalFile.txt";
        ArrayList<String> hostsList = new ArrayList<String>();
        try {
            hostsList = FileToArray(fileOut);
            System.out.println(hostsList);
        } catch (Exception e) {
            System.out.println("Esto no puede hacerse");
        }
    }

    public static int DividePorCero(int a , int b) throws ArithmeticException {

        try {
            return a / b;
        } catch (Exception e) {
            throw new ArithmeticException();
        }
    }

    public static void CopyFile(String fileIn, String fileOut) throws FileNotFoundException {

        try {
            InputStream file = new FileInputStream(fileIn);
            byte []dates = file.readAllBytes();
            file.close();

            PrintStream out = new PrintStream(fileOut);
            out.write(dates);
            out.close();
        }catch (Exception e){
            System.out.println(e.getClass());
        }

    }

    public static ArrayList<String> FileToArray(String fileOut ) throws FileNotFoundException {

        ArrayList<String> hostsList = new ArrayList<String>();

        try {
            InputStream file = new FileInputStream(fileOut);
            Scanner obj = new Scanner(file);

            while (obj.hasNextLine())
                hostsList.add(obj.nextLine());

        }catch (Exception e){
            System.out.println(e.getClass());
        }
        return hostsList;
    }

}
