package strategy.flyBehavior;

public class NoFly implements IFlyBehavior{
    @Override
    public void fly() {
        System.out.println("Can Not fly!");
    }
}
