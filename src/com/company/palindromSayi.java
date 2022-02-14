package com.company;

import java.util.Scanner;

public class palindromSayi {

    static boolean isPalindromic(int number) {
        int temp = number, lastNumber, reverseNumber = 0;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (reverseNumber == number) {
            System.out.println(number + " Palindrom sayıdır.");
            return true;
        } else{
            System.out.println(number + " Palindrom sayı değildir.");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Denemek istediginiz sayıyı giriniz : ");
        int number = input.nextInt();
        isPalindromic(number);
    }
}
