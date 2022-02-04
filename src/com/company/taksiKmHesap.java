package com.company;

import java.util.Scanner;

public class taksiKmHesap {

    public static void main(String[] args) {
        int km;
        double perKm=2.2, total, startPrice=10;

        Scanner input = new Scanner(System.in);
        System.out.print("Km giriniz: ");
        km = input.nextInt();

        total = (perKm*km);
        total += startPrice;
        total = (total < 20) ? 20 : total;

        System.out.print("Toplam tutar: "+total);
    }
}