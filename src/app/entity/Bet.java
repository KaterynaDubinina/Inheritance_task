package app.entity;

public class Bet {

    private final double betAmount;

    public Bet(double betAmount) {
        this.betAmount = betAmount;
    }

    public double getBetAmount() {
        return betAmount;
    }
}
