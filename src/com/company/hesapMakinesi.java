package com.company;

import java.util.Scanner;

public class hesapMakinesi {

    public static void main(String[] args) {
        double sayi1, sayi2;
        int select;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        sayi1 = input.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        sayi2 = input.nextDouble();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Bölme\n4-Çarpma");
        System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.print("Toplam : "+ (sayi1+sayi2));
                break;
            case 2:
                System.out.print("Çıkarma : "+ (sayi1-sayi2));
                break;
            case 3:
                double bolme = (sayi1>sayi2) ? (sayi1/sayi2) : (sayi2/sayi1);
                System.out.print((sayi1 == 0 || sayi2 == 0) ? "Değeri sıfır olan sayılar bölme işlemine dahil edilemez.!": bolme);
                break;
            case 4:
                System.out.print("Çarpma : "+ (sayi1*sayi2));
                break;
            default:
                System.out.print("Hatalı bir seçim yaptınız! programı tekrar çalıştırınız.");
        }

    }
}