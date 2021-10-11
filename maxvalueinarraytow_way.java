package com.tientranjav;

import java.util.Scanner;

public class maxvalueinarraytow_way {
    public static void main(String[] args) {
        int array[][] = new int[3][3];
        int m=0;
        int n=0;
        int max = 0;
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i< array.length;i++){
            for(int j = 0; j< array[i].length; j++){
                System.out.print("nhap gia tri" +"["+ i +"]"+"["+ j +"]" );
                array[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i< array.length; i++){
            for (int j =0; j< array[i].length; j++){
                if(array[i][j] > max) {
                    max = array[i][j];
                    m = i;
                    n = j;
                };
            };
        };
        System.out.println("Max value = "+ max +" At index: " + "["+ m +"]" + "["+ n +"]" );
    }
}
