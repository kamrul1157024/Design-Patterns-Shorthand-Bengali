package decorator.addOn;

import decorator.Beverages.Beverage;

public class Whip extends AddOnDecorator{
    private final Beverage beverage;

    public Whip(Beverage beverage)
    {
        this.beverage=beverage;
    }

    @Override
    public int getCost() {
        return this.beverage.getCost()+3;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription()+" added Whip";
    }
}
