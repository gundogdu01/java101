package com.company;

import java.util.Scanner;

public class OrtalamaBulma {

    public static void main(String[] args) {
        int k;
        int sayac = 0, toplam = 0, ortalama;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        k = input.nextInt();

        for (int i = 0; i <= k; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                toplam += i;
                sayac++;
            }
        }
        ortalama = toplam / sayac;
        System.out.println("0'dan klavyeden girilen sayıya kadar 3'e ve 4'e bölünenlerin toplamı : " + toplam);
        System.out.println("0'dan klavyeden girilen sayıya kadar 3'e ve 4'e bölünenlerin ortalaması : " + ortalama);
    }
}
