package com.github.magdau.school.lab1.task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //zad3
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Proszę wpisać pierwsza, drugą i trzecią liczba zmiennnoprzecinkowa");

//        String rezulat = "";
//
//        while (isNumeric(odczyt)) {
//            odczyt.nextDouble();
//            return;
//        }

//        public static boolean isNumeric(String str)
//        {
//            for (char c : str.toCharArray())
//            {
//                if (!Character.isDigit(c)) return false;
//            }
//            return true;
//        }

        double liczba1 = odczyt.nextDouble();
        System.out.println("Wpisz drugą liczbe zmiennoprzecinkową");
        double liczba2 = odczyt.nextDouble();
        System.out.println("Wpisz trzecią liczbe zmiennoprzecinkową");
        double liczba3 = odczyt.nextDouble();
        double suma = liczba1 + liczba2 + liczba3;
        double srednia = (liczba1 + liczba2 + liczba3) / 2;
        System.out.println("Suma liczb wynosi: " + suma + "\n" + "Srednia wynosi :" + srednia);

    }
}
