package ArraysPractices;

import java.util.Scanner;

public class FindMatrixTranspose {
    public static void main(String[] args) {

        int[][] matrix = createMatrix(2,3);
        printMatrix(matrix);
        int[][] transpose = transposeOfMatrix(matrix);
        printMatrix(transpose);

    }

    public static int[][] createMatrix(int row, int column) {
        int[][] matrix = new int[row][column];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = createRandomNumber1To9();
            }
        }
        return matrix;
    }

    public static int[][] transposeOfMatrix(int[][] matrix) {
        int columnTranspose = matrix.length;
        int rowTranspose = matrix[0].length;
        int[][] transpose = new int[rowTranspose][columnTranspose];

        for (int i = 0, k = 0; i < transpose.length; i++, k++) {
            for (int j = 0, l = 0; j < transpose[i].length; j++, l++) {
                transpose[i][j] = matrix[l][k];
            }
        }
        return transpose;
    }

    public static int createRandomNumber1To9() {
        return  (int)(Math.random() * 10);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------");
    }
}
