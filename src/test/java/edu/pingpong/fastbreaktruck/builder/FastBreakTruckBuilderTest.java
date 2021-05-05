package edu.pingpong.fastbreaktruck.builder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FastBreakTruckBuilderTest {

    FastBreakTruckBuilder fastBreakTruckBuilder = null;

    @Before
    public void setupTest() {
        fastBreakTruckBuilder = new FastBreakTruckBuilder();
    }

    @Test
    public void prepareEyeholesTurbulentJuiceTest() {
        Breakfast eyeholesTurbulentJuice = fastBreakTruckBuilder.prepareEyeholesTurbulentJuice();
        Assert.assertEquals("Eyeholes", eyeholesTurbulentJuice.getItems().get(0).name());
        Assert.assertEquals("TurbulentJuice", eyeholesTurbulentJuice.getItems().get(1).name());
        Assert.assertEquals(18.8, eyeholesTurbulentJuice.getCost(), 0.001);
    }
}
