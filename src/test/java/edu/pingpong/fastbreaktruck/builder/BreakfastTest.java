package edu.pingpong.fastbreaktruck.builder;

import edu.pingpong.fastbreaktruck.concrete.Plumbus;
import edu.pingpong.fastbreaktruck.representation.Item;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BreakfastTest {

    Breakfast breakfast = null;
    Item plumbus = null;

    @Before
    public void setupTest() {
        breakfast = new Breakfast();
        plumbus = new Plumbus();
    }

    @Test
    public void addItemTest() {
        breakfast.addItem(plumbus);
        Assert.assertEquals(plumbus, breakfast.getItems().get(0));
    }

    @Test
    public void getCostTest() {
        breakfast.addItem(plumbus);
        Assert.assertEquals(69.0f, breakfast.getCost(), 0.001);
    }
}
