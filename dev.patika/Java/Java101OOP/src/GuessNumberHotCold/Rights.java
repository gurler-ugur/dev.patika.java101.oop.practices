package GuessNumberHotCold;

public class Rights {

    int numberOfGuessing;

    Rights(int numberOfGuessing) {
        this.numberOfGuessing = numberOfGuessing;
    }

    @Override
    public String toString() {
        return "Rights{" +
                "numberOfGuessing=" + numberOfGuessing +
                '}';
    }
}
