package edu.pingpong.fastbreaktruck.concrete;

import edu.pingpong.fastbreaktruck.domain.Cereal;

public class Smiggles extends Cereal {
    @Override
    public String name() {
        return "Smiggles";
    }

    @Override
    public float price() {
        return 11.0f;
    }
}