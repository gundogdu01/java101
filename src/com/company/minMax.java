package com.company;

import java.util.Scanner;

public class minMax {

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz : ");
        n = input.nextInt();
        /*while (i<=n){
            System.out.print(i+". Sayıyı giriniz : ");
            int k = input.nextInt();
            i++;
        }*/
        int maks=0,min=0;
        for (int i = 1; i <=n; i++){
            System.out.print(i+". Sayıyı giriniz : ");
            int k = input.nextInt();
            if (k==1){
                maks=k;
            }else if (k>maks){
                maks=k;
            }else {
                min = k;
            }
        }
        System.out.println("En büyük sayı : "+maks);
        System.out.println("En küçük sayı : "+min);
    }
}
