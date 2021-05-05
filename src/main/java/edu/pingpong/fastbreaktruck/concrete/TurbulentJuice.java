package edu.pingpong.fastbreaktruck.concrete;

import edu.pingpong.fastbreaktruck.domain.Drink;

public class TurbulentJuice extends Drink {
    @Override
    public String name() {
        return "TurbulentJuice";
    }

    @Override
    public float price() {
        return 4.5f;
    }
}
