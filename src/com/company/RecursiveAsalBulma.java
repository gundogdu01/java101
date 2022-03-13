package com.company;

import java.util.Scanner;

public class RecursiveAsalBulma {

    static boolean isPrime(int sayi, int a){
        if(a>=sayi){
            return true;
        }
        if(sayi%a==0){
            return false;
        }
        else return isPrime(sayi,a+1);
    }

    public static void main(String[] args) {
        int sayi;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        sayi = scan.nextInt();
        System.out.println(isPrime(sayi,2)?"Asal Sayıdır":"Asal Sayı Değildir");
    }
}