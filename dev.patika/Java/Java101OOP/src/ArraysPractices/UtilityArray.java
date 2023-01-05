package ArraysPractices;

import java.util.Arrays;

public class UtilityArray {

    static double calculateAverageArray(int[][] matrix) {
        return (double) sumOfArray(matrix) / numberOfElementsArray(matrix);
    }

    static double calculateAverageArray(int[] list) {
        return (double) sumOfArray(list) / numberOfElementsArray(list);
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

    static double calculateHarmonicMeanArray(int[] list) {
        int sum = 0;
        for (int a : list) {
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

    static int sumOfArray(int[] list) {
        int sum = 0;
        for (int a : list) {
            sum += a;
        }
        return sum;
    }

    static int numberOfElementsArray(int[][] matrix) {
        return matrix.length * matrix[0].length;
    }

    static int numberOfElementsArray(int[] list) {
        return list.length;
    }

    static void fillArrayNumbersRandom(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 10);
            }
        }
    }

    static void fillArrayNumbersRandom(int[] list) {
        for (int row = 0; row < list.length; row++) {
            list[row] = (int) (Math.random() * 100);
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

    static int findMinNumberOfArray(int[] list) {
        int minNumber = list[0];
        for (int a : list) {
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

    static int findMaxNumberOfArray(int[] list) {
        int maxNumber = list[0];
        for (int a : list) {
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

    static int findClosestNumberToMax(int[] list) {
        int maxNumber = findMaxNumberOfArray(list);
        int closestNumber = 0;
        for (int a : list) {
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

    static int findClosestNumberToMin(int[] list) {
        int minNumber = findMinNumberOfArray(list);
        int closestNumber = 0;
        for (int a : list) {
            if (a == minNumber) {
                continue;
            }
            closestNumber = a < closestNumber ? a : closestNumber;
        }
        return closestNumber;
    }

    static void findClosestNumbersToGivenNumber(int[] list, int number) {
        int closestLessNumber = 0, closestGreaterNumber = 0;
        Arrays.sort(list);
        for (int i = 1; i < list.length; i++) {
            if (number <= list[i] && number >= list[i - 1]) {
                closestLessNumber = list[i - 1];
                closestGreaterNumber = list[i];
            }
        }
        System.out.println("Closest Less Number Than Given Number: " + closestLessNumber + "\n"
                + "Closest Greater Number Than Given Number: " + closestGreaterNumber);
    }

    static void drawLetterA(String[][] matrix) {
        String star = "*";
        String space = " ";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0 || i == 4) {
                    matrix[i][j] = star;
                } else if (j == 0 || j == 5) {
                    matrix[i][j] = star;
                } else {
                    matrix[i][j] = space;
                }
            }
        }
    }

    static void drawLetterB(String[][] matrix) {
        String star = "*";
        String space = " ";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0 || i == 4 || i == 8) {
                    matrix[i][j] = star;
                } else if (j == 0 || j == 5) {
                    matrix[i][j] = star;
                } else {
                    matrix[i][j] = space;
                }
            }
        }
    }

    static int[] findDuplicatedNumbers(int[] list) {
        int[] duplicated = new int[list.length];
        int index = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (!isListHas(duplicated, list[i])) {
                        duplicated[index++] = list[i];
                        break;
                    }
                }
            }
        }
        return duplicated;
    }

    static int[] findEvenNumbers(int[] list) {
        int[] evenNumbers = new int[list.length];
        int index = 0;
        for (int a: list){
            if (a % 2 == 0) {
                evenNumbers[index++] = a;
            }
        }
        return evenNumbers;
    }

    static boolean isListHas(int[] list, int number) {
        for (int i : list) {
            if (i == number) {
                return true;
            }
        }
        return false;
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

    static void printArray(int[] list) {
        System.out.println("Row Size: " + list.length + "\n"
                + "======================");
        System.out.println("*** ARRAY ***");
        for (int a : list) {
            System.out.print(a + " ");
        }
        System.out.println("\n" + "======================");
    }

    static void printArray(String[][] matrix) {
        for (String[] row : matrix) {
            for (String column : row) {
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
