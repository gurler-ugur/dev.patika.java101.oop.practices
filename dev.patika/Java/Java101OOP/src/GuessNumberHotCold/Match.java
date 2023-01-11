package GuessNumberHotCold;

public class Match {


    Guesses guesses;
    Messages messages;
    boolean isGameOver;

    Match() {
        this.guesses = new Guesses();
        this.messages = new Messages();
        this.isGameOver = false;
    }

    boolean isMatched() {
        return guesses.guess == guesses.setUp.lucky.number;
    }

    boolean isHasRightsOver() {
        return guesses.counter == guesses.setUp.rights.numberOfGuessing;

    }

    void checkGameStatus() {
        if (isMatched()) {
            System.out.println(Messages.success);
            this.isGameOver = true;
        } else if (isHasRightsOver()) {
            System.out.println(Messages.failed);
            this.isGameOver = true;
        }
    }

    @Override
    public String toString() {
        return "Match{" +
                "guesses=" + guesses +
                ", messages=" + messages +
                ", isGameOver=" + isGameOver +
                '}';
    }
}
