package Pattern4Factory.mod2.classes.pizzesStores;

import Pattern4Factory.mod2.classes.pizzez.Pizza;

public class CaliforniaPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CaliforniaCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new CaliforniaPepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new CaliforniaClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new CaliforniaVeggiePizza();
        }

        return pizza;
    }
