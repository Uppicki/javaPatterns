package Pattern4Factory.mod1.classes.pizzez;

import Pattern4Factory.mod1.interfaces.Pizza;

public class VeggiePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Готовиться вегетарианская");
    }
}
