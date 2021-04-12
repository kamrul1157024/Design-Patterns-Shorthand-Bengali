package decorator.Beverages;

import decorator.Beverages.Beverage;

public class Expresso extends Beverage {
    public Expresso()
    {
        super.description="Expresso";
    }

    @Override
    public int getCost() {
        return 1;
    }
}
