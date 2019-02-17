package com.github.magdau.school.lab1.task5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(" Program, który oblicza |x| ");

        Scanner odczytLiczby = new Scanner(System.in); // odczytanie danych od użytkownika
        System.out.println(" Podaj przykładową liczbe ");
        int liczbaX = odczytLiczby.nextInt();

        int wynik = liczbaBezwzglednaNaPiechote(liczbaX);
        int wynik1 = liczbaX < 0 ? liczbaX *= (-1) : liczbaX;
        int obliczWartoscBezwgledna = Math.abs(liczbaX);

        System.out.println("Wartość bezwględna liczby podanej " + wynik);
        System.out.println("Wartość bezwględna liczby podanej " + wynik1);
        System.out.println("Wartość bezwględna liczby podanej " + obliczWartoscBezwgledna);
    }

    private static int liczbaBezwzglednaNaPiechote(int liczbaX) {
        if (liczbaX < 0) {
            liczbaX *= (-1);
        }
        return liczbaX;
    }
}
