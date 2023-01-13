package MineSweeper;

import java.util.Arrays;
import java.util.Objects;

public class Guesses {
    Mines mines;
    int row;
    int column;
    int counter;
    int[][] guess;
    boolean isGameOver;

    Guesses() {
        this.mines = new Mines();
        this.guess = new int[1][2];
        this.counter = 0;
        this.isGameOver = false;
        while (!isGameOver) {
            Utility.printMatrix(mines.map);
            getGuesses();
            setGuesses();
        }
    }

    void getGuesses() {
        System.out.println(Messages.guess);
        do {
            this.counter = 0;
            this.row = Utility.getUserInput(Messages.row);
            this.column = Utility.getUserInput(Messages.column);
            if (this.row >= mines.field.length || this.column >= mines.field.width) {
                System.out.println(Messages.errorRowOrColumn);
            }
            this.guess[0][0] = this.row;
            this.guess[0][1] = this.column;
            calculate();
        } while (this.row >= mines.field.length || this.column >= mines.field.width);
        isGameOver();
    }

    void setGuesses() {
        /*isGameOver();*/
        if (!isGameOver) {
            mines.map[row][column] = " " + this.counter + " ";
        }
    }

    void calculate() {
        int k = Math.min(row + 1, mines.field.length - 1);
        int l = Math.min(column + 1, mines.field.width - 1);
        for (int i = row == 0 ? 0 : row - 1; i <= k; i++) {
            for (int j = column == 0 ? 0 : column - 1; j <= l; j++) {
                if (Objects.equals(mines.map[i][j], mines.placeMine)) {
                    this.counter++;
                }
            }
        }
    }

    void isGameOver() {
        if (Objects.equals(mines.map[row][column], mines.placeMine)) {
            this.isGameOver = true;
            System.out.println(Messages.gameOverFailed);
        }

        int counter = 0;
        for (int i = 0; i < mines.field.length; i++) {
            for (int j = 0; j < mines.field.width; j++) {
                if (Objects.equals(mines.map[i][j], mines.field.placeBlank)) {
                    counter++;
                }
            }
        }

        if (counter == 1) {
            this.isGameOver = true;
            System.out.println(Messages.gameOverSuccess);
        }

    }

    @Override
    public String toString() {
        return "Guess{" +
                "mines=" + mines +
                ", row=" + row +
                ", column=" + column +
                ", guesses=" + Arrays.toString(guess) +
                ", isGameOver=" + isGameOver +
                '}';
    }
}
