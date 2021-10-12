package com.tientranjav.exscisejaems;

import java.util.Scanner;

public class addvaluetoarray {
    public static void main(String[] args) {
        int myArray[] = {5,4,8,9,10,15,1};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so can them");
        int inputValue = scanner.nextInt();
        System.out.println("Nhap vi tri can them");
        int index = scanner.nextInt();
        if (index <= -1 && index >= myArray.length -1){
            System.out.println("Khong the them vao mang");
        } else{

        };
    }
}
