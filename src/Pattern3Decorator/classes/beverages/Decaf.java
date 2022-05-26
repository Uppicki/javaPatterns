package Pattern3Decorator.classes.beverages;

import Pattern3Decorator.classes.Beverage;

public class Decaf extends Beverage {


    public Decaf() {
        description = "Decaf";
    }


    @Override
    public double cost() {
        return 1.05;
    }
}
