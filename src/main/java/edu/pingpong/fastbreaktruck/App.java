package edu.pingpong.fastbreaktruck;

import edu.pingpong.fastbreaktruck.builder.Breakfast;
import edu.pingpong.fastbreaktruck.builder.FastBreakTruckBuilder;

public class App {

    public static void main(String[] args) {

        FastBreakTruckBuilder fastBreakTruckBuilder = new FastBreakTruckBuilder();

        Breakfast eyeholesTurbulentJuice = fastBreakTruckBuilder.prepareEyeholesTurbulentJuice();
        System.out.println("==== Eyeholes With TurbulentJuice ====\n");
        eyeholesTurbulentJuice.showItems();
        System.out.println("Total cost : " + eyeholesTurbulentJuice.getCost() + "\n");

        Breakfast smigglesFleebJuice = fastBreakTruckBuilder.prepareSmigglesFleebJuice();
        System.out.println("==== Smiggles With FleebJuice ====\n");
        smigglesFleebJuice.showItems();
        System.out.println("Total cost : " + smigglesFleebJuice.getCost() + "\n");

        Breakfast prepareEyeholesTurbulentJuiceWithPlumbus = fastBreakTruckBuilder.prepareEyeholesTurbulentJuiceWithPlumbus();
        System.out.println("==== Smiggles With FleebJuice ====\n");
        prepareEyeholesTurbulentJuiceWithPlumbus.showItems();
        System.out.println("Total cost : " + prepareEyeholesTurbulentJuiceWithPlumbus.getCost() + "\n");
    }
}
