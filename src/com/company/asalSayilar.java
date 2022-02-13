package com.company;

import java.util.Scanner;

public class asalSayilar {

    public static void main(String[] args) {
        int counter;
        for(int i=2;i<=100;i++) {
            counter=1;
            for (int j = 1; j < i; j++) {
                if (i%j==0){
                    counter++;
                }
            }
            if (counter==2){
                System.out.print(i+" ");
            }
        }
    }
}
