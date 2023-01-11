package GuessNumberHotCold;

public class Game {

    Match match;

    Game() {
        this.match = new Match();
    }

    @Override
    public String toString() {
        return "Game{" +
                "match=" + match +
                '}';
    }
}
