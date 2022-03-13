package com.company;

import java.util.Scanner;

public class ArmstrongSayi {

    public static void main(String[] args) {

        int counter=0; int sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz: ");
        int number = scanner.nextInt();

        while (number!=0) {
            int  remainder = number % 10;
            sum += remainder;
            number = number/10 ;
            counter++;
        }

        System.out.println("Basamak Sayınız: "+counter);
        System.out.println("Basamak Değerleri Toplamı: "+sum);

        Scanner input=new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result=0;
        int basPow;

        //girilen sayının kaç basamaklı oldugunu hesaplayan döngü.
        while (tempNumber != 0){
            tempNumber /= 10;
            basNumber++;
        }

        //girilen sayının basamaklarını ayrıştıran döngü.
        tempNumber=number;
        while (tempNumber !=0){
            basValue = tempNumber %10;
            basPow=1;
            for (int i=1; i<=basNumber;i++){
                basPow*=basValue;
            }
            result+=basPow;
            tempNumber/=10;
        }

        if (result==number){
            System.out.println(number+" sayısı bir armstrong sayısıdır.");
        }else {
            System.out.println(number+" sayısı bir armstrong sayısı degildir.");
        }
    }
}
