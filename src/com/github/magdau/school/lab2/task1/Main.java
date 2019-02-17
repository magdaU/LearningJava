package com.github.magdau.school.lab2.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Zad 1
        System.out.println("Zadanie ma wypisywac liczby od 1 do n ( n -przez usytkownika)");
        Scanner odczyt = new Scanner(System.in);

        //pobranie niewiadomych od uzytkownika
        System.out.println("Podaj wartość liczby n ");
        int n = odczyt.nextInt();

        int liczbaPoczatkowa = 0;
        int odliczanie = 0;
        for (liczbaPoczatkowa = 0; liczbaPoczatkowa <= n; liczbaPoczatkowa++) {
            odliczanie = liczbaPoczatkowa + 1;
            System.out.println("Liczby:" + liczbaPoczatkowa);
        }

        //zad 1 z while
        Scanner odczytanie1 = new Scanner(System.in);
        //pobranie niewiadomych od uzytkownika
        System.out.println("Podaj wartość liczby n1 ");
        int n1 = odczytanie1.nextInt();

        int liczbaPoczatkowa1 = -1;
        //int odliczanie1 = 0;
        while (liczbaPoczatkowa1 < n1) {
            liczbaPoczatkowa1++;
            System.out.println("Liczby:" + liczbaPoczatkowa1);
        }

        //zad 1 z do...while
        Scanner odczytanie2 = new Scanner(System.in);
        //pobranie niewiadomych od uzytkownika
        System.out.println("Podaj wartość liczby n2 ");
        int n2 = odczytanie1.nextInt();

        int liczbaPoczatkowa2 = -1;
        do {
            liczbaPoczatkowa2++;
            System.out.println("Liczby:" + liczbaPoczatkowa2);
        }
        while (liczbaPoczatkowa2 < n2);
    }
}