package strategy;

import strategy.flyBehavior.NoFly;
import strategy.flyBehavior.SimpleFly;
import strategy.quackBehavior.SimpleQuack;

public class StrategyMain {
    public static void main(String[] args) {

        Duck plasticDuck= new Duck(new NoFly(),new SimpleQuack());
        Duck normalDuck=new Duck(new SimpleFly(),new SimpleQuack());

        Duck customDuck= new Duck(()->{
            System.out.println("Custom Fly!");
        },()->{
            System.out.println("Custom Quack!");
        });

        plasticDuck.fly();
        normalDuck.fly();
        customDuck.quack();

    }
}
