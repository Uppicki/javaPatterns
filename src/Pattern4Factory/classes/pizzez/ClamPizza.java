package Pattern4Factory.classes.pizzez;

import Pattern4Factory.interfaces.Pizza;

public class ClamPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Готовиться морепродукты");
    }
}
