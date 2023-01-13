package MineSweeper;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Mines {

    Field field;
    String[][] map;
    String placeMine = " * ";
    int[][] locations;
    int totalMines;

    Mines() {
        this.field = new Field();
        this.map = field.map;
        this.totalMines = field.totalArea / 4;
        this.locations = new int[totalMines][2];
        createMines();
    }

    void createMines() {
        Random random = new Random();
        int mineLocationRow, mineLocationColumn;
        for (int mine = 0; mine < this.totalMines; mine++) {
            do {
                mineLocationRow = random.nextInt(field.length);
                mineLocationColumn = random.nextInt(field.width);
            } while (Objects.equals(this.map[mineLocationRow][mineLocationColumn], placeMine));
            this.map[mineLocationRow][mineLocationColumn] = placeMine;
            this.locations[mine][0] = mineLocationRow;
            this.locations[mine][1] = mineLocationColumn;
        }

    }

    @Override
    public String toString() {
        return "Mines{" +
                "field=" + field +
                ", map=" + Arrays.toString(map) +
                ", placeMine='" + placeMine + '\'' +
                ", locations=" + Arrays.toString(locations) +
                ", totalMines=" + totalMines +
                '}';
    }
}

