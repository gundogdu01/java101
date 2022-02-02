package com.company;

import java.util.Scanner;

public class manavKasa {

    public static void main(String[] args) {
        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5.0;
        int armutKg,elmaKg,domatesKg,muzKg,patlicanKg;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut kaç kilo ? :");
        armutKg = input.nextInt();
        System.out.print("Elma kaç kilo ? :");
        elmaKg = input.nextInt();
        System.out.print("Domates kaç kilo ? :");
        domatesKg = input.nextInt();
        System.out.print("Muz kaç kilo ? :");
        muzKg = input.nextInt();
        System.out.print("Patlıcan kaç kilo ? :");
        patlicanKg = input.nextInt();

        double toplam = (armut*armutKg)+(elma*elmaKg)+(domates*domatesKg)+(muz*muzKg)+(patlican*patlicanKg);

        System.out.println("Toplam tutar : "+toplam+" TL");
    }
}