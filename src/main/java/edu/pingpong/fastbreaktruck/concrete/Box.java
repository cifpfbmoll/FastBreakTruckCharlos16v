package edu.pingpong.fastbreaktruck.concrete;

import edu.pingpong.fastbreaktruck.representation.Packing;

public class Box implements Packing {
    @Override
    public String pack() {
        return "Box";
    }
}
