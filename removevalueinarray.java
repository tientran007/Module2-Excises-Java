package com.tientranjav;

import java.util.Scanner;

public class removevalueinarray {
    public static void main(String[] args) {
        int myArray[] = {1, 2, 4, 6, 10, 8, 7};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao phan tu can xoa");
        int input = scanner.nextInt();
        for (int i = 0; i < myArray.length; i++) {
            if (input == myArray[i]) {
                for (; i < myArray.length - 1; i++) {
                    myArray[i] = myArray[i+1];
                };
            };
        };
        for (int p:myArray) {
            System.out.print(p);
        }
    };
};
