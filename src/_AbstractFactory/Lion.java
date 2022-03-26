package _AbstractFactory;

public class Lion implements Animal<String>{
    @Override
    public String Speak() {
        return "Roar";
    }
}
