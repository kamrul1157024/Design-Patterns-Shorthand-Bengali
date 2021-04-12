package strategy;

import strategy.flyBehavior.IFlyBehavior;
import strategy.quackBehavior.IQuackBehavior;

public class Duck {
    private final IFlyBehavior flyBehavior;
    private final IQuackBehavior quackBehavior;

    public Duck(IFlyBehavior flyBehavior,IQuackBehavior quackBehavior)
    {
        this.flyBehavior=flyBehavior;
        this.quackBehavior=quackBehavior;
    }

    void quack()
    {
        quackBehavior.quack();
    }

    void fly()
    {
        flyBehavior.fly();
    }
}
