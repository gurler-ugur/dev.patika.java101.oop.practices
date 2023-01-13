package MineSweeper;

import java.util.Arrays;

public class Field {

    String[][] map;
    String placeBlank = " - ";
    int length;
    int width;
    int totalArea;

    Field() {
        this.length = Utility.getUserInput(Messages.fieldLength);
        this.width = Utility.getUserInput(Messages.fieldWidth);
        this.totalArea = length * width;
        this.map = new String[this.length][this.width];
        createField();
    }

    void createField() {
        for (int row = 0; row < length; row++) {
            for (int column = 0; column < width; column++) {
                map[row][column] = placeBlank;
            }
        }
    }

    @Override
    public String toString() {
        return "Field{" +
                "map=" + Arrays.toString(map) +
                ", placeBlank='" + placeBlank + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", totalArea=" + totalArea +
                '}';
    }
}
