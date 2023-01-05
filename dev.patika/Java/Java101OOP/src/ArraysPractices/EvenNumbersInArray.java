package ArraysPractices;

public class EvenNumbersInArray {
    public static void main(String[] args) {

        int[] list = new int[UtilityArray.fillArrayLengthRandom() * 5];
        UtilityArray.fillArrayNumbersRandom(list);
        UtilityArray.printArray(list);

        int[] evenNumbers = UtilityArray.findEvenNumbers(list);
        UtilityArray.printArray(evenNumbers);
    }
}
