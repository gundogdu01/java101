package com.company;

import java.util.Scanner;

public class KdvOran {

    public static void main(String[] args) {
        double tutar,kdvOran = 0.18,kdvTutar, kdvliTutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir tutar giriniz: ");
        tutar = input.nextDouble();

        if (tutar>0 && tutar<1000) {
            kdvTutar = kdvOran * tutar;
            kdvliTutar = kdvTutar + tutar;

            System.out.println("Kdv'siz tutar: " + tutar);
            System.out.println("Kdv oran: " + kdvOran);
            System.out.println("Kdv tutarı: " + kdvTutar);
            System.out.println("Kdvli tutar: " + kdvliTutar);
        }else if(tutar>=1000){
            kdvOran = 0.08;
            kdvTutar = kdvOran * tutar;
            kdvliTutar = kdvTutar + tutar;

            System.out.println("Kdv'siz tutar: " + tutar);
            System.out.println("Kdv oran: " + kdvOran);
            System.out.println("Kdv tutarı: " + kdvTutar);
            System.out.println("Kdvli tutar: " + kdvliTutar);
        } else
            System.out.println("Lütfen 0'dan büyük bir tutar giriniz. !");
    }
}
