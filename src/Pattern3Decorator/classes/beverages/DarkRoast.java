package Pattern3Decorator.classes.beverages;

import Pattern3Decorator.classes.Beverage;

public class DarkRoast extends Beverage {


    public DarkRoast() {
        description = "Dark Roast";
    }

    public double cost() {
        return .99;
    }
}
