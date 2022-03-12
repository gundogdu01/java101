package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class DizideTekrarEdenler {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {3, 5, 6, 8, 9,8, 5, 3, 2, 1, 9, 4, 4, 9, 5};
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (!isFind(duplicate, list[i]))
                        duplicate[startIndex++] = list[i];
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(duplicate));

        for (int value : duplicate){
            if (value != 0){
                if (value % 2 == 0){
                    System.out.print(value + " ");
                }
            }
        }
    }
}