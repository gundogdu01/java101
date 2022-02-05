package com.company;

import java.util.Scanner;

public class buyuktenKucuge {

    public static void main(String[] args) {
        int sayi1, sayi2, sayi3;
        Scanner scan = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz:");
        sayi1 = scan.nextInt();
        System.out.print("2. sayıyı giriniz:");
        sayi2 = scan.nextInt();
        System.out.print("3. sayıyı giriniz:");
        sayi3 = scan.nextInt();

        if ((sayi1)>(sayi2) && (sayi1)>(sayi3)){
            if ((sayi2>sayi3) ) {
                System.out.println("1.Sayı > 2.Sayı > 3.Sayı");
            } else {
                System.out.println("1.Sayı > 3.Sayı > 2.Sayı");
            }
        } else if((sayi2>sayi3) &&(sayi2>sayi1)){
            if(sayi3>sayi1) {
                System.out.println("2.Sayı > 3.Sayı > 1.Sayı");
            }else {
                System.out.println("2.Sayı > 1.Sayı > 3.Sayı");
            }
        } else if ((sayi3>sayi2) && (sayi3>sayi1)) {
            if (sayi2>sayi1){
                System.out.println("3.Sayı > 2.Sayı > 1.Sayı");
            }else {
                System.out.println("3.Sayı > 1.Sayı > 2.Sayı");
            }
        }
    }
}
