package MineSweeper;

import java.util.Scanner;

public class Utility {

    static int getUserInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    static void printMatrix(String[][] matrix) {
        for (String[] strings : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(strings[j]);
            }
            System.out.println();
        }
    }

    static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(ints[j]);
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Utility{}";
    }
}
