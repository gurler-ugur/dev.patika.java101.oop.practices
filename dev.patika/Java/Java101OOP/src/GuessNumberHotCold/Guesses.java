package GuessNumberHotCold;

import java.util.Arrays;
import java.util.Scanner;

public class Guesses {

    SetUp setUp;
    int guess;
    int[] lastGuess;
    int counter;
    int distance;

    Guesses() {
        this.setUp = new SetUp();
        this.guess = 0;
        this.counter = 0;
        this.lastGuess = new int[setUp.rights.numberOfGuessing];
        this.distance = 0;
    }

    void setGuess() {
        Scanner scanner = new Scanner(System.in);
        this.guess = scanner.nextInt();
        this.lastGuess[counter] = this.guess;
        this.distance = Math.abs(this.guess - setUp.lucky.number);
        this.counter++;
    }

    void compareDistances() {

        if (this.distance <= setUp.rangeMin) {
            System.out.println(Messages.burning);
        } else if (this.distance <= setUp.rangeMid) {
            System.out.println(Messages.veryHot);
        } else if (this.distance <= setUp.rangeMax) {
            System.out.println(Messages.hot);
        } else if (this.distance <= setUp.rangeMax * 2) {
            System.out.println(Messages.cold);
        } else if (this.distance <= setUp.rangeMax * 4) {
            System.out.println(Messages.veryCold);
        } else {
            System.out.println(Messages.freezing);
        }
    }

    @Override
    public String toString() {
        return "Guesses{" +
                "setUp=" + setUp +
                ", guess=" + guess +
                ", lastGuess=" + Arrays.toString(lastGuess) +
                ", counter=" + counter +
                ", distances=" + distance +
                '}';
    }
}
