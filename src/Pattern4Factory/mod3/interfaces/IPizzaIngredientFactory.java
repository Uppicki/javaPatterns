package Pattern4Factory.mod3.interfaces;

public interface IPizzaIngredientFactory {
    Dough creteDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
