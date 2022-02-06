package com.company;

import java.util.Scanner;

public class ucakBilet {

    public static void main(String[] args) {
        int yas, biletSekli;
        double km, normalTutar, yasIndirimOrani = 0.0, toplamTutar, biletSecimIndırım = 0.0;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz : ");
        km = input.nextDouble();
        if (km <= 0) {
            System.out.println("Hatalı veri girdiniz");
            System.exit(0);
        }
        System.out.print("Yaşınızı Giriniz : ");
        yas = input.nextInt();
        if (yas <= 0) {
            System.out.println("Hatalı veri girdiniz");
            System.exit(0);
        }
        System.out.print("Yolculuk tipini seçiniz(1=> Tek yön, 2=> Gidiş dönüş) : ");
        biletSekli = input.nextInt();

        normalTutar = km * 0.10;

        if (yas < 12) {
            yasIndirimOrani = normalTutar * 0.50;
        } else if (yas >= 12 && yas <= 24) {
            yasIndirimOrani = normalTutar * 0.10;
        } else if (yas >= 65) {
            yasIndirimOrani = normalTutar * 0.30;
        } else {
            yasIndirimOrani = 0;
        }

        switch (biletSekli) {
            case 1:
                toplamTutar = (normalTutar - yasIndirimOrani);
                System.out.print("Toplam tutar : " + toplamTutar);
                break;
            case 2:
                biletSecimIndırım = normalTutar * 0.20;
                toplamTutar = (normalTutar - yasIndirimOrani) + (normalTutar - biletSecimIndırım);
                System.out.print("Toplam tutar : " + toplamTutar);
                break;
            default:
                System.out.println("Hatalı veri girdiniz.!");

        }
    }
}
