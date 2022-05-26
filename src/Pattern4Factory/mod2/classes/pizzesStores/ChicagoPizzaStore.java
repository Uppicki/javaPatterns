package Pattern4Factory.mod2.classes.pizzesStores;

import Pattern4Factory.mod2.classes.pizzez.Pizza;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new ChicagoCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoPepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ChicagoClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new ChicagoVeggiePizza();
        }

        return pizza;
    }
}
