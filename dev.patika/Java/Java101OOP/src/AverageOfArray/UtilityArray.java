package AverageOfArray;

public class UtilityArray {

    static double calculateAverageArray(int[][] matrix) {
        return (double) sumOfArray(matrix) / numberOfElementsArray(matrix);
    }

    static double calculateHarmonicMeanArray(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += (matrix[i][j] == 0 ? 0 : 1 / matrix[i][j]);
            }
        }
        return sum;
    }

    static int sumOfArray(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    static int numberOfElementsArray(int[][] matrix) {
        return matrix.length * matrix[0].length;
    }

    static void fillArrayNumbersRandom(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 10);
            }
        }
    }

    static int fillArrayLengthRandom() {
        int random;
        do {
            random = (int) (Math.random() * 10);
        } while (random < 1);
        return random;
    }


    static void printArray(int[][] matrix) {
        System.out.println("Row Size: " + matrix.length + "\n"
                + "Column Size: " + matrix[0].length + "\n"
                + "======================");
        System.out.println("*** MATRIX ***");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println("======================");
    }

}
