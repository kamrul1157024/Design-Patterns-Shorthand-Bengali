package strategy.quackBehavior;

public class SimpleQuack implements IQuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack! Quack!! Quack!!!");
    }
}
