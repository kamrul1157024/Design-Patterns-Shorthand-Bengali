package strategy.flyBehavior;

public class SimpleFly implements IFlyBehavior{
    @Override
    public void fly() {
        System.out.println("Able to fly!");
    }
}
