package Pattern3Decorator.classes.beverages;

import Pattern3Decorator.classes.Beverage;

public class Espresso extends Beverage {


    public Espresso() {
        description = "Espresso";
    }


    public double cost() {
        return 1.99;
    }

}
