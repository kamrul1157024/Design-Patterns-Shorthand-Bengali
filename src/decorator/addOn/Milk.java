package decorator.addOn;

import decorator.Beverages.Beverage;

public class Milk extends AddOnDecorator{

    private final Beverage beverage;

    public Milk(Beverage beverage)
    {
        this.beverage=beverage;
    }

    @Override
    public int getCost() {
        return beverage.getCost()+1;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" with Milk";
    }
}
