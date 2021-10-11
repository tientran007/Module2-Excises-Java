package com.tientranjav;

public class EX_findMinValue {
    public static void main(String[] args) {
        int array[] = {2,5,9,4,100,77,6};
        int min = array[0];
        for (int i = 1; i < array.length; i++){
            if(min > array[i]){
                min = array[i];
            };
        }
        System.out.println("Min value in array is: " + min);
    }
}
