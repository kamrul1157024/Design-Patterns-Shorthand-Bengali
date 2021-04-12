package abstractFactory.components.text;

public class DarkText implements Text{
    @Override
    public void show() {
        System.out.println("Dark Text!");
    }
}
