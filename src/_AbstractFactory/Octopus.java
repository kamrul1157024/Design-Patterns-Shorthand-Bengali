package _AbstractFactory;

public class Octopus implements Animal<String> {
    @Override
    public String Speak() {
        return "SQUAWK";
    }
}
