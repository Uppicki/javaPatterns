package Pattern3Decorator.classes.beverages;

import Pattern3Decorator.classes.Beverage;

public class HouseBlend extends Beverage {


    public HouseBlend() {
        description = "House Blend";
    }


    @Override
    public double cost() {
        return .89;
    }
}
