package ArraysPractices;

public class GivenNumberComparingWithArray {

    public static void main(String[] args) {

        int[] matrix = new int[10];

        UtilityArray.fillArrayNumbersRandom(matrix);
        UtilityArray.printArray(matrix);

        int numberGiven = InputAndScan.oneNumber();
        UtilityArray.findClosestNumbersToGivenNumber(matrix, numberGiven);

    }

}
