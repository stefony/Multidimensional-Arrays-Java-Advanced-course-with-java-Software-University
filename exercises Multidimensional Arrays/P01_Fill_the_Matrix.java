package Multidimensional_Arrays;

import java.util.Scanner;

public class P01_Fill_the_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int n = Integer.parseInt(input.split(", ")[0]);
        String pattern  = input.split(", ")[1];

        int [][] matrix = new int[n][n];

        if (pattern.equals("A")){
            fillPatternA(matrix);

        }else if (pattern.equals("B")){

            fillPatternB(matrix);
        }
        printMatrix(matrix);

    }

    private static void printMatrix(int [][] matrix) {
        for (int row = 0; row < matrix.length  ; row++) {
            for (int col = 0; col <matrix.length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillPatternB(int[][] matrix) {
        int firstNumber = 1;
        for (int col = 0; col < matrix.length; col++) {
            if ((col + 1) % 2 == 0){
                for (int row = matrix.length-1; row >=0 ; row--) {
                    matrix[row][col] = firstNumber;
                    firstNumber++;
                }
            }else {
                for (int row = 0; row <matrix.length ; row++) {
                    matrix[row][col] = firstNumber;
                    firstNumber++;
                }
            }
        }
    }

    private static void fillPatternA(int[][] matrix) {
        int firstNumber = 1;

        for (int col = 0; col < matrix.length ; col++) {
            for (int row = 0; row < matrix.length ; row++) {
                matrix[row][col] = firstNumber;
                firstNumber++;
            }
        }
    }
}
