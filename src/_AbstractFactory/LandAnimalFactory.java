package _AbstractFactory;

public class LandAnimalFactory extends AnimalFactory {
    @Override
    public Animal<String> getAnimal(String factoryType) {
        Animal<String> animal=null;
        if ("Cat".equals(factoryType))
        {
            animal=new Cat();
        }
        else if ("Dog".equals(factoryType))
        {
            animal=new Dog();
        }else if ("Lion".equals(factoryType))
        {
            animal=new Lion();
        }
        return animal;
    }
}
