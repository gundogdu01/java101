package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class DiziElemanlariInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz : ");
        int a = 0;
        int[] list = new int[input.nextInt()];
        System.out.println("Dizinin elemanlarını giriniz : ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(i+1 + ". Elemanı : ");
            list[i] = input.nextInt();
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
