package abstractFactory.components.button;

public class DarkButton implements Button{
    @Override
    public void show() {
        System.out.println("Dark Button!");
    }
}
