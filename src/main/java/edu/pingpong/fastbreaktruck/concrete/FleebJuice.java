package edu.pingpong.fastbreaktruck.concrete;

import edu.pingpong.fastbreaktruck.domain.Drink;

public class FleebJuice extends Drink {
    @Override
    public String name() {
        return "FleebJuice";
    }

    @Override
    public float price() {
        return 5.0f;
    }
}
