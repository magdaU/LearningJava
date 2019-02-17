package com.github.magdau.school.lab1.task7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Zadanie na obliczenie układu rownan z dwoma niewiadomymi metodą  Cramera 1");
        Scanner odczyt = new Scanner(System.in);

        //wzor Cramera ( pierwotny)
//        e = a*X + b*Y;
//        f = c*X + d*Y;

        //pobranie niewiadomych od uzytkownika
        System.out.println("Podaj pierwsz wartosc wspolczynnika a ");
        int a = odczyt.nextInt();
        System.out.println("Podaj pierwsz wartosc wspolczynnika b ");
        int b = odczyt.nextInt();
        System.out.println("Podaj pierwsz wartosc wspolczynnika c ");
        int c = odczyt.nextInt();
        System.out.println("Podaj pierwsz wartosc wspolczynnika d ");
        int d = odczyt.nextInt();
        System.out.println("Podaj pierwsz wartosc wspolczynnika e ");
        int e = odczyt.nextInt();
        System.out.println("Podaj pierwsz wartosc wspolczynnika f ");
        int f = odczyt.nextInt();


        int x1 = (e * d - b * f) / (a * d - b * c);
        int y1 = (a * f - e * c) / (a * d - b * c);
        System.out.println("Rozwiązanie układu równań:" +  "  x1:" + x1 + " y1:  " + y1);
    }
}