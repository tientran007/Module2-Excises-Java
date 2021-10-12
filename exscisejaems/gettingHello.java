package com.tientranjav.exscisejaems;

import java.util.Scanner;

public class gettingHello {
    public static void main(String[] args) {
        System.out.println("Enter Your Name: ");
        Scanner scanner = new Scanner(System.in);
       String name = scanner.next();
        System.out.println("Hello " + name);
    }
}
