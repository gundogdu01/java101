package com.company;

import java.util.Scanner;

public class DordunKatlari {

    public static void main(String[] args) {
        int total = 0, n;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Bir sayı Giriniz: ");
            n = scan.nextInt();
            if (n % 4 == 0) {
                total += n;
            }
        } while (n % 2 == 0);
        System.out.println("2 ve 4 tam bölünen sayıların toplamı : " + total);
    }
}
