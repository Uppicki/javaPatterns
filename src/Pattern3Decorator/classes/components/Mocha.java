package Pattern3Decorator.classes.components;

import Pattern3Decorator.classes.Beverage;
import Pattern3Decorator.classes.CondimentDecorator;

public class Mocha extends CondimentDecorator {


    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public String getDescription() {
        return beverage.getDescription() + " with Mocha, ";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}
