package edu.pingpong.fastbreaktruck.concrete;

import edu.pingpong.fastbreaktruck.domain.Cereal;

public class Eyeholes extends Cereal {
    @Override
    public String name() {
        return "Eyeholes";
    }

    @Override
    public float price() {
        return 14.3f;
    }
}
