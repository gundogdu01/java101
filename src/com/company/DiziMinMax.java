package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class DiziMinMax {

    public static void main (String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        System.out.println(Arrays.toString(list));
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı : ");
        int number = inp.nextInt();
        int min = number;
        int max = number;

        Arrays.sort(list);

        for (int i = 0; i < Arrays.toString(list).length(); i++){
            if (number < list[i]){
                min = list[i-1];
                max = list[i];
                break;
            }
        }
        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);
    }
}