package com.oracle.section8;

public class Array2D {
    public static void main(String[] args) {
        int [][] matrix = new int[7][];
        for(int i=0; i < matrix.length; i++) {
            matrix[i] = new int [i+1];
            for(int j=0; j < matrix[i].length; j++) {
                matrix[i][j] = i + j;
            }
        }
        for(int []arr : matrix) {
            for(int elem : arr) {
                System.out.print(elem + "   ");
            }
            System.out.println();
        }
    }
}
