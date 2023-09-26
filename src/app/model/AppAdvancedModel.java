package app.model;

import app.entity.Bet;

public class AppAdvancedModel extends AppBaseModel {

    @Override
    public double calcPayment(Bet bet) {
        double base = bet.getBetAmount() / 100 * 125;
        return base - bet.getBetAmount() / 100 * 5;
    }
}
