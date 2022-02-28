package com.umg.data.menu;

public class Menu {

    public static void menuPrincipal(){
        // Estos son los elementos que contiene el menu
        System.out.println("\n --- Colas --- \n" +
                "1.- Basadas en Arrays \n" +
                "2.- Basadas en Listas \n" +
                "3.- Salir \n");

        System.out.print("Dígita una operación: ");
    }


    public static void menuArrays(){
        System.out.println("   --- Basadas en Arrays --- \n" +
                "1.- Encolar \n" +
                "2.- Desencolar \n" +
                "3.- Cima \n" +
                "4.- Tamaño \n");

        System.out.print("Dígita una operación: ");
    }


    public static void menuListas(){
        System.out.println("   --- Basadas en Listas --- \n" +
                "1.- Encolar \n" +
                "2.- Desencolar \n" +
                "3.- Cima \n" +
                "4.- Tamaño \n");

        System.out.print("Dígita una operación: ");
    }
}
