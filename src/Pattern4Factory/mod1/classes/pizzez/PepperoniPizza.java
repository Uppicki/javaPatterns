package Pattern4Factory.mod1.classes.pizzez;

import Pattern4Factory.mod1.interfaces.Pizza;

public class PepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Готовиться пепперони");
    }
}