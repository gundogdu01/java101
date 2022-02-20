package com.company;

import java.util.Scanner;

public class desen {
    static int desen(int a, int b, boolean isReturned) {
        if (a > 0 && !isReturned) {
            System.out.print(a + " ");
            return desen(a - 5, b, isReturned);
        } else if (a <= 0 || isReturned && a <= b) {
            isReturned = true;
            System.out.print(a + " ");
            return desen(a + 5, b, isReturned);
        }
        return 0;
    }

    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz  : ");
        num = input.nextInt();
        desen(num, num, false);
    }
}