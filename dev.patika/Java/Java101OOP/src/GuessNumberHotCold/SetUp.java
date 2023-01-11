package GuessNumberHotCold;

public class SetUp {

    Lucky lucky;
    Rights rights;
    int totalDistance;
    int rangeMin;
    int rangeMid;
    int rangeMax;

    SetUp() {
        this.lucky = new Lucky(1, 100);
        this.rights = new Rights(7);
        this.totalDistance = (this.lucky.finish - this.lucky.start);
        setDistancesRange(0.05, 0.10, 0.20);
    }

    void setDistancesRange(double rangeMinRate, double rangeMidRate, double rangeMaxRate) {
        this.rangeMin = (int) (this.totalDistance * rangeMinRate);
        this.rangeMid = (int) (this.totalDistance * rangeMidRate);
        this.rangeMax = (int) (this.totalDistance * rangeMaxRate);
    }

    @Override
    public String toString() {
        return "SetUp{" +
                "lucky=" + lucky +
                ", rights=" + rights +
                ", totalDistance=" + totalDistance +
                ", rangeMin=" + rangeMin +
                ", rangeMid=" + rangeMid +
                ", rangeMax=" + rangeMax +
                '}';
    }
}
