package com.github.magdau.school.lab1.task6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Program znajdującego większą z dwóch liczb");
        System.out.println("Wpisz pierwszą liczbe zmiennoprzecinkową");
        Scanner odczytDanych = new Scanner(System.in); //obiekt do odebrania danych od użytkownika

        double liczba1 = odczytDanych.nextDouble();
        System.out.println("Wpisz drugą liczbe zmiennoprzecinkową");
        double liczba2 = odczytDanych.nextDouble();
        if (liczba1 >= liczba2) {
            System.out.println("Liczba większa bądz równa jest   " + liczba1 + ", a następnie " + liczba2);
        } else {
            System.out.println("Liczbą większa jest  " + liczba2 + ",  " + liczba1);
        }
    }
}
