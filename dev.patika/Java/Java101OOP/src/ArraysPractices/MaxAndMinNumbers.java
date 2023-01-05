package ArraysPractices;

public class MaxAndMinNumbers {

    public static void main(String[] args) {

        int[][] matrix = new int[UtilityArray.fillArrayLengthRandom()][UtilityArray.fillArrayLengthRandom()];

        UtilityArray.fillArrayNumbersRandom(matrix);
        UtilityArray.printArray(matrix);

        System.out.println("Max number: " + UtilityArray.findMaxNumberOfArray(matrix));
        System.out.println("Closest number to max: " + UtilityArray.findClosestNumberToMax(matrix));

        System.out.println("Min number: " + UtilityArray.findMinNumberOfArray(matrix));
        System.out.println("Closest number to min: " + UtilityArray.findClosestNumberToMin(matrix));

    }
}
