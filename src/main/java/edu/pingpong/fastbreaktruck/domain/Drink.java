package edu.pingpong.fastbreaktruck.domain;

import edu.pingpong.fastbreaktruck.concrete.Tube;
import edu.pingpong.fastbreaktruck.representation.Item;
import edu.pingpong.fastbreaktruck.representation.Packing;

public abstract class Drink implements Item {

    @Override
    public Packing packing() {
        return new Tube();
    }

    @Override
    public abstract float price();
}
