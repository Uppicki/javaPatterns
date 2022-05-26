package Pattern3Decorator.classes;

public abstract class CondimentDecorator extends Beverage{
    Beverage beverage;

    @Override
    public abstract String getDescription();
}
