package com.company;

import java.util.Scanner;

public class tersUcgen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz : ");
        int n = input.nextInt();

        for (int x = 0; x <= n; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(" ");
            }
            for (int z = 1; z <= 2 * (n - x) - 1; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
