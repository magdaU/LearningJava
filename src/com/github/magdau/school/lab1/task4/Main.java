package com.github.magdau.school.lab1.task4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner odczytDanych = new Scanner(System.in);
        System.out.println("Program oblicza pole odcinka kołowego"
                + "\n" + "Proszę  podac promien R");

        double promien = odczytDanych.nextDouble();
        System.out.println("Prosze podac kąt w rozwarciach");
        double kat = odczytDanych.nextDouble();

        double przeliczKatNaRadian = (Math.PI * kat)/180;
        System.out.println("Teraz przeliczymy podamy kat na radiany: " + przeliczKatNaRadian);

        double poleOdcinkaKolowego = (promien * promien)/2 * (przeliczKatNaRadian - Math.sin(przeliczKatNaRadian));
        System.out.println("Pole odcinka kolowego wynosi:  "  + poleOdcinkaKolowego);
    }
}
