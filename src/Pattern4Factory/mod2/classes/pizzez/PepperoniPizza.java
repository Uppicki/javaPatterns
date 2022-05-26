package Pattern4Factory.mod2.classes.pizzez;

import Pattern4Factory.mod2.interfaces.Pizza;

public class PepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Готовиться пепперони");
    }
}