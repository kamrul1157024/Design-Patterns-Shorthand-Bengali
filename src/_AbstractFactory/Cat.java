package _AbstractFactory;

public class Cat implements Animal<String> {
    @Override
    public String Speak() {
        return "Meow Meow Meow";
    }
}
