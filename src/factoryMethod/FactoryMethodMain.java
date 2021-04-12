package factoryMethod;

import decorator.Beverages.Beverage;

public class FactoryMethodMain {

    public static void main(String[] args) {

        BeverageCreator customCoffeeCreator=new CustomCoffeeCreator();
        Beverage coffee= customCoffeeCreator.createBeverage(
                                "expresso",
                                        "whip",
                                        "soy",
                                        "soy",
                                        "milk",
                                        "soy");

        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost());

    }
}
