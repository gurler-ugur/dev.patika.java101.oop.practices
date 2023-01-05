package ArraysPractices;

public class DrawingShapes {

    public static void main(String[] args) {

        String[][] matrix = new String[9][6];

        UtilityArray.drawLetterA(matrix);
        UtilityArray.printArray(matrix);

        System.out.println();

        UtilityArray.drawLetterB(matrix);
        UtilityArray.printArray(matrix);
    }
}
