package app.controller;

import app.entity.Bet;
import app.entity.Player;
import app.model.AppAdvancedModel;
import app.model.AppBaseModel;
import app.model.AppMaxModel;
import app.utils.Random;
import app.utils.Rounder;
import app.view.AppView;


public class AppController {

    private final AppView view = new AppView();
    private final static String CURRENCY = "EUR";

    public void getPayment() {
        String[] data = view.getData();
        Player player = getPlayer(data);
        Bet bet = getBet(data);
        int random = Random.point();
        String output;
        if (random < 3) {
            AppBaseModel model = new AppBaseModel();
            String payment = Rounder.roundValue(model.calcPayment(bet));
            output = "\nPlayer " + player.getName() + ", you won " + CURRENCY + " " + payment;
            view.getOutput(output);
        } else if (random <= 7) {
            AppAdvancedModel model = new AppAdvancedModel();
            String payment = Rounder.roundValue(model.calcPayment(bet));
            output = "\nPlayer " + player.getName() + ", you won " + CURRENCY + " " + payment;
            view.getOutput(output);
        } else {
            AppMaxModel model = new AppMaxModel();
            String payment = Rounder.roundValue(model.calcPayment(bet));
            output = "\nPlayer " + player.getName() + ", you won " + CURRENCY + " " + payment;
            view.getOutput(output);
        }
    }

    private Player getPlayer(String[] data) {
        return new Player(data[0]);
    }

    private Bet getBet(String[] data) {
        return new Bet(Double.parseDouble(data[1]));
    }
}
