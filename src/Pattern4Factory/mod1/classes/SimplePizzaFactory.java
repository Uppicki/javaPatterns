package Pattern4Factory.classes;

import Pattern4Factory.classes.pizzez.CheesePizza;
import Pattern4Factory.classes.pizzez.ClamPizza;
import Pattern4Factory.classes.pizzez.PepperoniPizza;
import Pattern4Factory.classes.pizzez.VeggiePizza;
import Pattern4Factory.interfaces.Pizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}