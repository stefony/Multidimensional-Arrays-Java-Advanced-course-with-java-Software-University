package Multidimensional_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P07_Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];

        List<List<Integer>> matrix = new ArrayList<>();
        fillMatrix(matrix, rows, cols);

        String command = scanner.nextLine();
        while (!command.equals("Nuke it from orbit")) {
            String[] tokens = command.split("\\s+");
            int row = Integer.parseInt(tokens[0]);
            int col = Integer.parseInt(tokens[1]);
            int radius = Integer.parseInt(tokens[2]);

            for (int r = row - radius; r <= row + radius; r++) {
                if (isInMatrix(r, col, matrix)) {
                    matrix.get(r).remove(col);
                }
            }

            for (int c = col + radius; c >= col - radius; c--) {
                if (isInMatrix(row, c, matrix)) {
                    matrix.get(row).remove(c);
                }
            }

            matrix.removeIf(List::isEmpty);  // Clean up empty lists

            command = scanner.nextLine();
        }

        printMatrix(matrix);
    }

    private static boolean isInMatrix(int row, int col, List<List<Integer>> matrix) {
        return row >= 0 && row < matrix.size() && col >= 0 && col < matrix.get(row).size();
    }

    private static void fillMatrix(List<List<Integer>> matrix, int rows, int cols) {
        int number = 1;
        for (int r = 0; r < rows; r++) {
            List<Integer> currentRow = new ArrayList<>();
            for (int c = 0; c < cols; c++) {
                currentRow.add(number++);
            }
            matrix.add(currentRow);
        }
    }

    private static void printMatrix(List<List<Integer>> matrix) {
        for (List<Integer> row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
