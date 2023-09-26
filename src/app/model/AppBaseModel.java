package app.model;

import app.entity.Bet;

public class AppBaseModel {
    public double calcPayment(Bet bet) {
        return bet.getBetAmount() / 100 * 125;
    }
}
