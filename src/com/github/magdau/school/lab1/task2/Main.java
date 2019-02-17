package com.github.magdau.school.lab1.task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Wczytuje znaki z klawiatury

        Scanner in = new Scanner(System.in);
        //Instrukcja dla uzytkownika zeby wpisal liczbe
        System.out.println("Wpisz pierwsza liczbe całkowitą, to bedzie liczba a");
        int a, b, c;
        a = in.nextInt();
        System.out.println("Teraz podaj liczbe b");
        b = in.nextInt();
        System.out.println("I ostatnia liczba c");
        c = in.nextInt();
        System.out.println("Wczytane liczby:" +
                "\n" + "a: " + a
                + "\n" + "b: " + b
                + "\n" + "c: " + c);
    }
}
