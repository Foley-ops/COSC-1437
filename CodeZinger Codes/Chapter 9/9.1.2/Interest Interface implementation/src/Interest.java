public interface Interest {
    static final int rate = 25;
    public default double simpleInterest() {
        return this.rate;
    }
    public default double compInterest() {
        return this.rate;
    }
}