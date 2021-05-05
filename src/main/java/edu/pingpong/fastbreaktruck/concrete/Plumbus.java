package edu.pingpong.fastbreaktruck.concrete;

import edu.pingpong.fastbreaktruck.domain.Toy;

public class Plumbus extends Toy {
    @Override
    public String name() {
        return "Plumbus";
    }

    @Override
    public float price() {
        return 69.0f;
    }
}
