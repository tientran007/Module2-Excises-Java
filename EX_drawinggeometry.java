package com.tientranjav;

public class EX_drawinggeometry {
    public static void main(String[] args) {
        for(int i = 1; i <= 3; i++ ){
            for (int j = 1; j <= 7;j++ ){
            System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=6; i++){
            for(int j=1; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=6;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
