public class Timer {
    private ClockHand miliseconds;
    private ClockHand seconds;

    public Timer() {
        this.miliseconds = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance() {
        this.miliseconds.advance();

        if (this.miliseconds.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return this.seconds + ":" + this.miliseconds;
    }
}
