package com.company;

import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz : ");
        num = input.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;

        for (int i = 0; i <= num; i++) {
            System.out.print(c + " ");
            a = b;
            b = c;
            c = a + b;
        }
    }
}
