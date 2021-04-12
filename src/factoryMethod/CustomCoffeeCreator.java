package factoryMethod;

import decorator.Beverages.Beverage;
import decorator.Beverages.Expresso;
import decorator.Beverages.HouseBlend;
import decorator.addOn.Milk;
import decorator.addOn.Soy;
import decorator.addOn.Whip;

import java.util.Arrays;

public class CustomCoffeeCreator implements BeverageCreator{

    boolean isExist(String[] options,String word)
    {
        return Arrays.binarySearch(options,word)!=-1;
    }

    @Override
    public Beverage createBeverage(String... options) {


        Beverage coffee=null;

        if (isExist(options,"expresso"))
            coffee=new Expresso();
        else
            coffee=new HouseBlend();

        for (int i=0;i<options.length;i++)
        {
            if (options[i].equals("soy")) coffee=new Soy(coffee);
            else if (options[i].equals("milk")) coffee= new Milk(coffee);
            else if (options[i].equals("whip")) coffee= new Whip(coffee);
        }

        return coffee;
    }
}
