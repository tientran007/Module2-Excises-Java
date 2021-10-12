package com.tientranjav.exscisejaems;

import java.util.Scanner;

public class SumOfColumn {
    public static void main(String[] args) {
        int array[][] = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i< array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print("Nhap vao mang vi tri ["+i+"]"+"["+j+"]: ");
                 array[i][j] = scanner.nextInt();
            };
        };
        System.out.print("Nhap vao cot can tinh: ");
        int rownumber = scanner.nextInt();
        int total = 0;
        if(rownumber >= 0) {
            for (int i = 0; i< array.length; i++){
               total = total + array[i][rownumber];
            };
        } else {
            System.out.println("So cot khong hop le");
        };
        System.out.println("Tong so cua cot "+ rownumber +" la: " + total);
    }
}
