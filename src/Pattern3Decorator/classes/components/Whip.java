package Pattern3Decorator.classes.components;

import Pattern3Decorator.classes.Beverage;
import Pattern3Decorator.classes.CondimentDecorator;

public class Whip extends CondimentDecorator {


    public Whip (Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public double cost() {
        return .10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with whip, ";
    }
}
