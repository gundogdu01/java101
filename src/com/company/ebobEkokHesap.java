package com.company;

import java.util.Scanner;

public class ebobEkokHesap {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz : ");
        int n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz : ");
        int n2 = input.nextInt();

        int ebob = 1, ekok, i = 2;
        while (i < n1 && i < n2) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        ekok = (n1 * n2) / ebob;
        System.out.println("Ebob : " + ebob +" Ekok : " + ekok);
    }
}
