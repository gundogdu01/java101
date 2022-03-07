package com.company;

import java.util.Scanner;

public class HarmonikOrtalama {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double sum = 0, sum1 = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += 1 / numbers[i];
            sum1 += numbers[i];
        }
        System.out.println("Ortalama : " + sum1 / numbers.length);
        System.out.println("Harmonik Ortalama : " + numbers.length / sum);
    }
}