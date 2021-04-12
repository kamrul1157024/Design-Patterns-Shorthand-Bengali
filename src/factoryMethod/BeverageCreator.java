package factoryMethod;

import decorator.Beverages.Beverage;

public interface BeverageCreator {
    Beverage createBeverage(String ...options);
}
