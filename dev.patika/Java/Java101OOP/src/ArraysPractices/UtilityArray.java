package ArraysPractices;

import java.util.Arrays;

public class UtilityArray {

    static double calculateAverageArray(int[][] matrix) {
        return (double) sumOfArray(matrix) / numberOfElementsArray(matrix);
    }

    static double calculateAverageArray(int[] matrix) {
        return (double) sumOfArray(matrix) / numberOfElementsArray(matrix);
    }

    static double calculateHarmonicMeanArray(int[][] matrix) {
        int sum = 0;
        for (int[] a : matrix) {
            for (int b : a) {
                sum += (b == 0 ? 0 : (1 / b));
            }
        }
        return sum;
    }

    static double calculateHarmonicMeanArray(int[] matrix) {
        int sum = 0;
        for (int a : matrix) {
            sum += (a == 0 ? 0 : (1 / a));
        }
        return sum;
    }

    static int sumOfArray(int[][] matrix) {
        int sum = 0;
        for (int[] a : matrix) {
            for (int b : a) {
                sum += b;
            }
        }
        return sum;
    }

    static int sumOfArray(int[] matrix) {
        int sum = 0;
        for (int a : matrix) {
            sum += a;
        }
        return sum;
    }

    static int numberOfElementsArray(int[][] matrix) {
        return matrix.length * matrix[0].length;
    }

    static int numberOfElementsArray(int[] matrix) {
        return matrix.length;
    }

    static void fillArrayNumbersRandom(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 10);
            }
        }
    }

    static void fillArrayNumbersRandom(int[] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = (int) (Math.random() * 100);
        }
    }

    static int fillArrayLengthRandom() {
        int random;
        do {
            random = (int) (Math.random() * 10);
        } while (random < 1);
        return random;
    }

    static int findMinNumberOfArray(int[][] matrix) {
        int minNumber = matrix[0][0];
        for (int[] a : matrix) {
            for (int b : a) {
                minNumber = b < minNumber ? b : minNumber;
            }
        }
        return minNumber;
    }

    static int findMinNumberOfArray(int[] matrix) {
        int minNumber = matrix[0];
        for (int a : matrix) {
            minNumber = a < minNumber ? a : minNumber;
        }
        return minNumber;
    }

    static int findMaxNumberOfArray(int[][] matrix) {
        int maxNumber = matrix[0][0];
        for (int[] a : matrix) {
            for (int b : a) {
                maxNumber = b > maxNumber ? b : maxNumber;
            }
        }
        return maxNumber;
    }

    static int findMaxNumberOfArray(int[] matrix) {
        int maxNumber = matrix[0];
        for (int a : matrix) {
            maxNumber = a > maxNumber ? a : maxNumber;
        }
        return maxNumber;
    }

    static int findClosestNumberToMax(int[][] matrix) {
        int maxNumber = findMaxNumberOfArray(matrix);
        int closestNumber = 0;
        for (int[] a : matrix) {
            for (int b : a) {
                if (b == maxNumber) {
                    continue;
                }
                closestNumber = b > closestNumber ? b : closestNumber;
            }
        }
        return closestNumber;
    }

    static int findClosestNumberToMax(int[] matrix) {
        int maxNumber = findMaxNumberOfArray(matrix);
        int closestNumber = 0;
        for (int a : matrix) {
            if (a == maxNumber) {
                continue;
            }
            closestNumber = a > closestNumber ? a : closestNumber;
        }
        return closestNumber;
    }

    static int findClosestNumberToMin(int[][] matrix) {
        int minNumber = findMinNumberOfArray(matrix);
        int closestNumber = 0;
        for (int[] a : matrix) {
            for (int b : a) {
                if (b == minNumber) {
                    continue;
                }
                closestNumber = b < closestNumber ? b : closestNumber;
            }
        }
        return closestNumber;
    }

    static int findClosestNumberToMin(int[] matrix) {
        int minNumber = findMinNumberOfArray(matrix);
        int closestNumber = 0;
        for (int a : matrix) {
            if (a == minNumber) {
                continue;
            }
            closestNumber = a < closestNumber ? a : closestNumber;
        }
        return closestNumber;
    }

    static void findClosestNumbersToGivenNumber(int[] matrix, int number) {
        int closestLessNumber = 0, closestGreaterNumber = 0;
        Arrays.sort(matrix);
        for (int i = 1; i < matrix.length; i++) {
            if (number <= matrix[i] && number >= matrix[i - 1]) {
                closestLessNumber = matrix[i - 1];
                closestGreaterNumber = matrix[i];
            }
        }
        System.out.println("Closest Less Number Than Given Number: " + closestLessNumber + "\n"
                + "Closest Greater Number Than Given Number: " + closestGreaterNumber);
    }

    static void printArray(int[][] matrix) {
        System.out.println("Row Size: " + matrix.length + "\n"
                + "Column Size: " + matrix[0].length + "\n"
                + "======================");
        System.out.println("*** MATRIX ***");
        for (int[] a : matrix) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
        System.out.println("======================");
    }

    static void printArray(int[] matrix) {
        System.out.println("Row Size: " + matrix.length + "\n"
                + "======================");
        System.out.println("*** ARRAY ***");
        for (int a : matrix) {
            System.out.print(a + " ");
        }
        System.out.println("\n" + "======================");
    }
}
