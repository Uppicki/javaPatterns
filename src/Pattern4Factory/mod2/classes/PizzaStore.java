package Pattern4Factory.mod2.classes;

import Pattern4Factory.mod2.interfaces.Pizza;

public class PizzaStore {
    SimplePizzaFactory factory;


    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }


    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
