package Pattern4Factory.mod2.classes.pizzesStores;

import Pattern4Factory.mod2.classes.pizzez.NY.NYStyleCheesePizza;
import Pattern4Factory.mod2.classes.pizzez.NY.NYStyleClamPizza;
import Pattern4Factory.mod2.classes.pizzez.NY.NYStylePepperoniPizza;
import Pattern4Factory.mod2.classes.pizzez.Pizza;

public class NYPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new NYStyleClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new NYStyleCheesePizza();
        }

        return pizza;
    }
}
