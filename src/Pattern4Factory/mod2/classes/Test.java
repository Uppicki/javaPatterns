package Pattern4Factory.mod2.classes;

import Pattern4Factory.mod2.classes.pizzesStores.ChicagoPizzaStore;
import Pattern4Factory.mod2.classes.pizzesStores.NYPizzaStore;
import Pattern4Factory.mod2.classes.pizzesStores.PizzaStore;
import Pattern4Factory.mod2.classes.pizzez.Pizza;

public class Test {
    public static void main(String[] args) {
        PizzaStore ny = new NYPizzaStore();
        PizzaStore ch = new ChicagoPizzaStore();


        Pizza pizza = ny.orderPizza("cheese");
        System.out.println(pizza.getName());

        pizza = ch.orderPizza("cheese");
        System.out.println(pizza.getName());
    }
}
