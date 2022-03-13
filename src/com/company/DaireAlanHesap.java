package com.company;

import java.util.Scanner;

public class DaireAlanHesap {

    public static void main(String[] args) {
        int r, a;
        double pi = 3.14, alan, cevre, aci;

        Scanner input = new Scanner(System.in);
        System.out.print("Daire yarıçapını giriniz: ");
        r = input.nextInt();
        System.out.print("Daire merkez açısının ölçüsünü giriniz: ");
        a = input.nextInt();

        alan = (pi*r*r);
        cevre = (2*pi*r);
        aci = (pi * (r*r) * a) / 360;

        System.out.println("Daire alanı: "+alan);
        System.out.println("Daire çevresi: "+cevre);
        System.out.println("Daire diliminin alanı: "+aci);
    }
}