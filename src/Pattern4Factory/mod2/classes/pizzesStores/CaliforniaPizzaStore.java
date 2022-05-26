package Pattern4Factory.mod2.classes.pizzesStores;

import Pattern4Factory.mod2.classes.pizzez.California.CaliforniaStyleCheesePizza;
import Pattern4Factory.mod2.classes.pizzez.California.CaliforniaStyleClamPizza;
import Pattern4Factory.mod2.classes.pizzez.California.CaliforniaStylePepperoniPizza;
import Pattern4Factory.mod2.classes.pizzez.California.CaliforniaStyleVeggiePizza;
import Pattern4Factory.mod2.classes.pizzez.Pizza;

public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CaliforniaStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new CaliforniaStylePepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new CaliforniaStyleClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new CaliforniaStyleVeggiePizza();
        }

        return pizza;
    }
}
