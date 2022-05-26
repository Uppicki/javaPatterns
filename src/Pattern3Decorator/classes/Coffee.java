package Pattern3Decorator.classes;

import Pattern3Decorator.classes.beverages.DarkRoast;
import Pattern3Decorator.classes.beverages.Espresso;
import Pattern3Decorator.classes.components.Mocha;
import Pattern3Decorator.classes.components.Soy;

public class Coffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" +beverage.cost());


        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Soy(beverage1);

        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
    }
}
