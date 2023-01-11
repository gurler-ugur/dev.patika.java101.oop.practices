package GuessNumberHotCold;

public class Lucky {

    int start;
    int finish;
    int number;

    Lucky(int start, int finish) {
        this.start = start;
        this.finish = finish;
        this.number = createNumber(start, finish);
    }

    private int createNumber(int fromNumber, int toNumber) {
        int number = (int) (Math.random() * toNumber);
        if (number <= fromNumber) {
            while (number <= fromNumber) {
                number = (int) (Math.random() * toNumber);
            }
        }
        return number;
    }

    @Override
    public String toString() {
        return "Lucky{" +
                "start=" + start +
                ", finish=" + finish +
                ", number=" + number +
                '}';
    }
}
