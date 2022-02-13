package com.company;

import java.util.Scanner;

public class mukemmelSayi {

    public static void main(String[] args) {
        int n,total=0;
        Scanner input = new Scanner(System.in);

        for (int x =1; x<=3; x++){
            System.out.print("Bir sayı giriniz : ");
            n = input.nextInt();
            total=0;
            for (int i = 1; i < n; i++) {
                if (n%i==0){
                    total+=i;
                }
            }
            if (total==n){
                System.out.println(n + " Sayısı mükemmel sayıdır.");
            }else {
                System.out.println(n + " Sayısı mükemmel sayı degildir.");
            }
        }
    }
}