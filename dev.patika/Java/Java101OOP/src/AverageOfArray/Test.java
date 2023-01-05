package AverageOfArray;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int[][] matrix = new int[UtilityArray.fillArrayLengthRandom()][UtilityArray.fillArrayLengthRandom()];
        UtilityArray.fillArrayNumbersRandom(matrix);
        UtilityArray.printArray(matrix);
        System.out.println("Average: " + UtilityArray.calculateAverageArray(matrix));
        System.out.println("Harmonic: " + UtilityArray.calculateHarmonicMeanArray(matrix));

    }
}
