package decorator;

import decorator.Beverages.Beverage;
import decorator.Beverages.Expresso;
import decorator.Beverages.HouseBlend;
import decorator.addOn.Milk;
import decorator.addOn.Soy;
import decorator.addOn.Whip;

public class DecoratorMain {

    public static void main(String[] args) {
        Beverage coffeeA= new Milk(new Soy(new Expresso()));
        Beverage coffeeB= new Soy(new Whip(new Milk(new HouseBlend())));

        System.out.println(coffeeA.getCost());
        System.out.println(coffeeA.getDescription());


        System.out.println(coffeeB.getCost());
        System.out.println(coffeeB.getDescription());

    }
}
