package com.tientranjav.exscisejaems;

import java.util.Scanner;

public class convertCurren {
    public static void main(String[] args) {
        double rate = 23000;
        System.out.println("Enter VND: ");
        Scanner scanner = new Scanner(System.in);
        double vnd = scanner.nextDouble();
        double usd = vnd / rate;
        System.out.println( vnd + "VND" + " = " + usd + " USD");
    }
}
