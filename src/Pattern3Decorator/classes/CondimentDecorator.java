package Pattern3Decorator.classes;

public abstract class CondimentDecorator extends Beverage{
    protected Beverage beverage;

    @Override
    public abstract String getDescription();
}
