package factoryMethod;

import decorator.Beverages.Beverage;

/*
* Just create Random Factory*
*/

public class RandomCoffeeCreator implements BeverageCreator{


    @Override
    public Beverage createBeverage(String... options) {
        return null;
    }
}
