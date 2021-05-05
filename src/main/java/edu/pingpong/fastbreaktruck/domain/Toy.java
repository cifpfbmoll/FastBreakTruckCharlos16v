package edu.pingpong.fastbreaktruck.domain;

import edu.pingpong.fastbreaktruck.concrete.Box;
import edu.pingpong.fastbreaktruck.representation.Item;
import edu.pingpong.fastbreaktruck.representation.Packing;

public abstract class Toy implements Item {
    @Override
    public Packing packing() {
        return new Box();
    }

    @Override
    public abstract float price();
}
