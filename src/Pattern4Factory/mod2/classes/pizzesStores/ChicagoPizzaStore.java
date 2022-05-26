package Pattern4Factory.mod2.classes.pizzesStores;

import Pattern4Factory.mod2.classes.pizzez.Chicago.ChicagoStyleCheesePizza;
import Pattern4Factory.mod2.classes.pizzez.Chicago.ChicagoStyleClamPizza;
import Pattern4Factory.mod2.classes.pizzez.Chicago.ChicagoStylePepperoniPizza;
import Pattern4Factory.mod2.classes.pizzez.Chicago.ChicagoStyleVeggiePizza;
import Pattern4Factory.mod2.classes.pizzez.Pizza;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ChicagoStyleClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new ChicagoStyleVeggiePizza();
        }

        return pizza;
    }
}
