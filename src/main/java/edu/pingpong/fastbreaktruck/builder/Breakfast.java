package edu.pingpong.fastbreaktruck.builder;

import edu.pingpong.fastbreaktruck.representation.Item;

import java.util.ArrayList;
import java.util.List;

public class Breakfast {
    private final List<Item> items = new ArrayList<Item>();

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        getItems().add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : getItems()) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        getItems().forEach(item -> {
            System.out.println("Item : " + item.name() + "\n" +
                    "Packing : " + item.packing().pack() + "\n" +
                    "Price : " + item.price() + "\n");
        });
    }
}
