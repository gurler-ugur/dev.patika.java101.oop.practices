package ArraysPractices;

public class RepeatedNumbersInArray {
    public static void main(String[] args) {

        int[] matrix = new int[UtilityArray.fillArrayLengthRandom() * 5];

        UtilityArray.fillArrayNumbersRandom(matrix);
        UtilityArray.printArray(matrix);

        int[] duplicated = UtilityArray.findDuplicatedNumbers(matrix);
        UtilityArray.printArray(duplicated);
    }
}
