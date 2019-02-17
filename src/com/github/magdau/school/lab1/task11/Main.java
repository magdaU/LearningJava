package com.github.magdau.school.lab1.task11;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // write your code here
        // "Napisac schemat blokowy ktory liczy sume kwadratorow od 1 do n.Zasstosowac petle while");

        System.out.println("");
        Scanner odczyt = new Scanner(System.in);

        //program ma liczyc (od 1 do n) do kwadratu
        System.out.println("Podaj liczbe n ");
        int n = odczyt.nextInt();

        int zmienna=1;
        int sumaKwadratowLiczb = 0;
        while(zmienna <= n){
            sumaKwadratowLiczb= (zmienna * zmienna)+sumaKwadratowLiczb;
            zmienna++;
        }
        System.out.println("Suma kwadratow liczb wynosi " + sumaKwadratowLiczb);
        //System.out.println("");
    }
}