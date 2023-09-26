package app.model;

import app.entity.Bet;

public class AppMaxModel extends AppBaseModel {

    @Override
    public double calcPayment(Bet bet) {
        double win = bet.getBetAmount() * 2;
        win -= win / 100 * 10;
        return win;
    }
}
