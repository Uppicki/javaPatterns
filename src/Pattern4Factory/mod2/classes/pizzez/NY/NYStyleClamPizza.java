package Pattern4Factory.mod2.classes.pizzez.NY;

import Pattern4Factory.mod2.classes.pizzez.Pizza;

public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza() {
        name = "NY Style Sauce and Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
