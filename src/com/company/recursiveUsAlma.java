package com.company;

import java.util.Scanner;

public class recursiveUsAlma {

    static int power(int taban, int us){
        if(us!=0 && us>0){
            int result = taban* power(taban,us-1);
            return result;
        }else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int taban, us;
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değerini giriniz : ");
        taban = scan.nextInt();
        System.out.print("Üs değerini giriniz : ");
        us = scan.nextInt();
        System.out.println("Sonuç : "+ power(taban,us));
    }
}
