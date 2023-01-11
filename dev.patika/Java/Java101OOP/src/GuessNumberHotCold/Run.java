package GuessNumberHotCold;

public class Run {

    static void game() {
        Game newGame = new Game();
        System.out.println(Messages.welcome);
        System.out.println(Messages.explanation);
        System.out.println(Messages.totalGuessRights + newGame.match.guesses.setUp.rights.numberOfGuessing);
        while (!newGame.match.isGameOver) {
            System.out.println(Messages.guessMessage);
            newGame.match.guesses.setGuess();
            newGame.match.guesses.compareDistances();
            newGame.match.checkGameStatus();
        }
    }
}
