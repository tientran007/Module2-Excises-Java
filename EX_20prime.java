package com.tientranjav;

import java.util.Scanner;

public class EX_20prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so luong so nguyen to");
        int input = scanner.nextInt();
        int count = 0;
        int N = 2;
        int count2 = 0;
        while (count < input){
            for (int i = 1; i <= N;i++){
                if (N % i == 0){
                    count2++;
                }
            }
            if (count2 == 2){
                System.out.println(N);
                N++;
                count++;
            } else{
                N++;
            }
            count2 = 0;
        }
    }

}
