package com.company;

import java.util.Scanner;

public class Kombinasyon {

    public static void main(String[] args) {
        int n, r;

        Scanner input = new Scanner(System.in);
        System.out.print("N sayısını giriniz : ");
        n = input.nextInt();
        System.out.print("R sayısını giriniz : ");
        r = input.nextInt();

        int nFaktoriyel = 1;
        for (int i = 1; i <= n; i++) {
            nFaktoriyel *= i;
        }
        System.out.println(n + "! : " + nFaktoriyel);

        int rFaktoriyel = 1;
        for (int i = 1; i <= r; i++) {
            rFaktoriyel *= i;
        }
        System.out.println(r + "! : " + rFaktoriyel);

        int xFaktoriyel = 1;
        for (int i = 1; i <= n - r; i++) {
            xFaktoriyel *= i;
        }
        //C(n,r) = n! / (r! * (n-r)!)
        int kombinasyon, fark = n - r;
        kombinasyon = nFaktoriyel / (rFaktoriyel * xFaktoriyel);
        System.out.println("Kombinasyon : " + kombinasyon);
    }
}