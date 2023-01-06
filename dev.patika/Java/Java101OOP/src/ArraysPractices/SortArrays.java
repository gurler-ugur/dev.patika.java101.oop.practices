package ArraysPractices;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrays {

    public static void main(String[] args) {

        int[] array = SortArrays.inputArray(SortArrays.inputLength());

        System.out.println(Arrays.toString(array));

        SortArrays.minToMax(array);

        System.out.println(Arrays.toString(array));

    }

    static int inputLength() {
        Scanner length = new Scanner(System.in);
        System.out.print("Length of the Array: ");
        return length.nextInt();
    }

    static int[] inputArray(int length) {
        Scanner elements = new Scanner(System.in);
        int[] array = new int[length];
        int counterElement = 1;
        int index = 0;
        for (int i = 0; i < length; i++) {
            System.out.print("Enter " + counterElement + ". element: ");
            array[index] = elements.nextInt();
            index++;
            counterElement++;
        }
        return array;
    }

    static int[] maxToMin(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    static int[] minToMax(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (array[j] > array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
