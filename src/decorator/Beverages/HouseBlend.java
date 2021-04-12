package decorator.Beverages;

public class HouseBlend extends Beverage{

    public HouseBlend()
    {
        super.description="House Blend";
    }

    @Override
    public int getCost() {
        return 2;
    }
}
