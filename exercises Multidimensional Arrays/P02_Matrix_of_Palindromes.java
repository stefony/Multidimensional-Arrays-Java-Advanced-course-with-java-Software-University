package Multidimensional_Arrays;

import java.util.Scanner;

public class P02_Matrix_of_Palindromes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int r = input.nextInt();
        int c = input.nextInt();

        char[][] matrix = new char[r][c];

        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                matrix[row][col] = (char)('a' + row + col);
            }
        }

        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                System.out.print((char)('a' + row) + "" + matrix[row][col] + "" + (char)('a' + row));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
