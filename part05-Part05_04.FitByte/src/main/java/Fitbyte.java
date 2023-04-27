public class Fitbyte {
    private int age;
    private double restingHeartRate;

    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public double maxHeartRate() {
        return 206.3 - (0.711 * (double) this.age);
    }

    public double targetHeartRate(double percentageOfMaximum) {
        double targetHeartRate = (maxHeartRate() - this.restingHeartRate) *
            (percentageOfMaximum) + this.restingHeartRate;
        return targetHeartRate;
    }
}
