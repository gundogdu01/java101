package com.company;

import java.util.Scanner;

public class ZodyakBurcu {

    public static void main(String[] args) {
        int dogumYili, zodyak;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz: ");
        dogumYili = input.nextInt();

        zodyak = dogumYili % 12;
        switch (zodyak) {
            case 0:
                System.out.println("Cin Zodyağı Burcunuz : Maymun");
                break;
            case 1:
                System.out.println("Cin Zodyak Burcunuz : Horoz");
                break;
            case 2:
                System.out.println("Cin Zodyağı Burcunuz : Köpek");
                break;
            case 3:
                System.out.println("Cin Zodyak Burcunuz : Domuz");
                break;
            case 4:
                System.out.println("Cin Zodyağı Burcunuz : Fare");
                break;
            case 5:
                System.out.println("Cin Zodyak Burcunuz : Öküz");
                break;
            case 6:
                System.out.println("Cin Zodyağı Burcunuz : Kaplan");
                break;
            case 7:
                System.out.println("Cin Zodyak Burcunuz : Tavşan");
                break;
            case 8:
                System.out.println("Cin Zodyağı Burcunuz : Ejderha");
                break;
            case 9:
                System.out.println("Cin Zodyak Burcunuz : Yılan");
                break;
            case 10:
                System.out.println("Cin Zodyağı Burcunuz : At");
                break;
            case 11:
                System.out.println("Cin Zodyak Burcunuz : Koyun");
                break;
            default:
                System.out.println("Hatalı bir veri girdiniz.");
        }
    }
}
