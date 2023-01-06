package ArraysPractices;

import java.util.Arrays;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 20, 10, 10, 20, 5, 20, 5, 0, 9};
        getFrequenciesInIntArray(arr);
    }

    public static void getFrequenciesInIntArray(int[] intArray) {
        int arrayLength = intArray.length;

        int[] uniqueNumbersArray = new int[arrayLength];
        int differentNumberIndex = 0;

        for (int checkNumber : intArray) {
            if (!isFoundedValueInArray(checkNumber, uniqueNumbersArray)) {
                System.out.println(checkNumber + " sayısı " + findOneNumberFrequency(checkNumber, intArray) + " kere tekrar edildi.");
                uniqueNumbersArray[differentNumberIndex++] = checkNumber;
            }
        }

        if (isFoundedValueInArray(0, intArray)) {
            System.out.println(0 + " sayısı " + findOneNumberFrequency(0, intArray) + " kere tekrar edildi.");
        }

    }

    public static int findOneNumberFrequency(int number, int[] intArray) {
        int counter = 0;
        for (int n : intArray) {
            if (number == n) counter++;
        }
        return counter;
    }

    public static boolean isFoundedValueInArray(int searchedValue, int[] intArray) {
        boolean found = false;

        for (int n : intArray) {
            if (n == searchedValue) {
                found = true;
                break;
            }
        }
        return found;
    }
}