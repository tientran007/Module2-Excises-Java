package com.tientranjav;

import java.util.Scanner;

public class mergearray {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[7];
        int[] array3 = new int[12];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i< array1.length; i++){
            System.out.println("Nhap vao mang array 1 index " + i);
             array1[i] = scanner.nextInt();
        };
        for (int j = 0; j < array2.length; j++){
            System.out.println("Nhap vao mang array 2 index " + j);
            array2[j] = scanner.nextInt();
        }
        for (int k = 0; k < array1.length; k++){
            array3[k] = array1[k];
        };
        for (int l = 0; l < array2.length; l++){
            array3[array1.length+l] = array2[l];
        };
        for (int q: array3) {
            System.out.println(q);
        }
    }
}
