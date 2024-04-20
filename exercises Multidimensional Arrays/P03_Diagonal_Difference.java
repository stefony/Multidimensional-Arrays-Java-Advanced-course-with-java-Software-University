package Multidimensional_Arrays;

import java.util.Scanner;

public class P03_Diagonal_Difference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        // Read matrix values
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        // Calculate primary diagonal sum
        for (int i = 0; i < n; i++) {
            primaryDiagonalSum += matrix[i][i];
        }

        // Calculate secondary diagonal sum
        for (int i = 0; i < n; i++) {
            secondaryDiagonalSum += matrix[i][n - i - 1];
        }

        int difference = Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
        System.out.println( difference);
    }
}
