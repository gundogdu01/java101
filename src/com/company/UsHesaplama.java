package com.company;

import java.util.Scanner;

public class UsHesaplama {

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i *= 4) {
            System.out.println("4'ün üsleri : " + i);
        }
        for (int j = 1; j <= n; j *= 5) {
            System.out.println("5'ün üsleri : " + j);
        }
    }
}
