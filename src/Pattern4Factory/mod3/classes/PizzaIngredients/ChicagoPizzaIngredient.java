package Pattern4Factory.mod3.classes.PizzaIngredients;

import Pattern4Factory.mod3.interfaces.IPizzaIngredientFactory;

public class ChicagoPizzaIngredient implements IPizzaIngredientFactory {
    @Override
    public Dough creteDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new BlackOlives(), new Spinach(), new AgePlant()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozzenClams();
    }
}
