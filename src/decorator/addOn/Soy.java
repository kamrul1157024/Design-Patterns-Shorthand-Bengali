package decorator.addOn;

import decorator.Beverages.Beverage;

public class Soy extends AddOnDecorator{

    public final Beverage beverage;

    public Soy(Beverage beverage)
    {
        this.beverage=beverage;
    }

    @Override
    public int getCost() {
        return beverage.getCost()+2;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" added Soy";
    }
}
