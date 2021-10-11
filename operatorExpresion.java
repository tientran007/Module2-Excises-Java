package com.tientranjav;

import java.util.Scanner;

public class operatorExpresion {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter width: ");
        width = scanner.nextFloat();
        System.out.println("Enter Height: ");
        height = scanner.nextFloat();
        float area = width * height;
        System.out.println("Area = " + area);

    }
}
