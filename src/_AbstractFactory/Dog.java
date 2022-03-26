package _AbstractFactory;

public class Dog implements Animal<String> {
    @Override
    public String Speak() {
        return "Boak Boak";
    }
}
