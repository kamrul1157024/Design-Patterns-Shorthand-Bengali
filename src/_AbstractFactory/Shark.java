package _AbstractFactory;

public class Shark implements Animal<String> {
    @Override
    public String Speak() {
        return "Can not Speak";
    }
}
