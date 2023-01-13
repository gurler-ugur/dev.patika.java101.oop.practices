package MineSweeper;

import java.util.Objects;

public class Points {

    Guesses guesses;
    int point;

    Points() {
        this.guesses = new Guesses();
        calculate();
    }

    /*void calculatePoints(int i, int j) {
        i = guesses.row;
        j = guesses.column;
        int counter = 0;
        if (Objects.equals(guesses.mines.map[i - 1][j - 1], guesses.mines.placeMine)) {
            counter++;
        } else if (Objects.equals(guesses.mines.map[i - 1][j], guesses.mines.placeMine)) {
            counter++;
        } else if (Objects.equals(guesses.mines.map[i - 1][j + 1], guesses.mines.placeMine)) {
            counter++;
        } else if (Objects.equals(guesses.mines.map[i][j - 1], guesses.mines.placeMine)) {
            counter++;
        } else if (Objects.equals(guesses.mines.map[i][j], guesses.mines.placeMine)) {
            counter++;
        } else if (Objects.equals(guesses.mines.map[i][j + 1], guesses.mines.placeMine)) {
            counter++;
        } else if (Objects.equals(guesses.mines.map[i + 1][j - 1], guesses.mines.placeMine)) {
            counter++;
        } else if (Objects.equals(guesses.mines.map[i + 1][j], guesses.mines.placeMine)) {
            counter++;
        } else if (Objects.equals(guesses.mines.map[i + 1][j + 1], guesses.mines.placeMine)) {
            counter++;
        }
    }*/

    void calculate () {
        int counter = 0;
        int a = guesses.row;
        int b = guesses.column;

        for (int i = guesses.row - 1; i <= guesses.row + 1; i++) {
            for (int j = b - 1; j <= b + 1; j++) {
                if (Objects.equals(guesses.mines.map[i][j], guesses.mines.placeMine)) {
                    counter++;
                }
            }
        }
        this.point = counter;
    }

    @Override
    public String toString() {
        return "Points{" +
                "guesses=" + guesses +
                ", point=" + point +
                '}';
    }
}
