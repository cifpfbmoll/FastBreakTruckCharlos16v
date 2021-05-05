package edu.pingpong.fastbreaktruck.builder;

import edu.pingpong.fastbreaktruck.concrete.*;

public class FastBreakTruckBuilder {

    public Breakfast prepareEyeholesTurbulentJuice() {
        Breakfast breakfast = new Breakfast();
        breakfast.addItem(new Eyeholes());
        breakfast.addItem(new TurbulentJuice());
        return breakfast;
    }

    public Breakfast prepareSmigglesFleebJuice() {
        Breakfast breakfast = new Breakfast();
        breakfast.addItem(new Smiggles());
        breakfast.addItem(new FleebJuice());
        return breakfast;
    }

    public Breakfast prepareEyeholesTurbulentJuiceWithPlumbus() {
        Breakfast breakfast = new Breakfast();
        breakfast.addItem(new Eyeholes());
        breakfast.addItem(new TurbulentJuice());
        breakfast.addItem(new Plumbus());
        return breakfast;
    }
}
