package decorator.Beverages;

public abstract class Beverage {
    String description="Unknown Beverage";
    public String getDescription()
    {
        return description;
    }
    public abstract int getCost();
}

