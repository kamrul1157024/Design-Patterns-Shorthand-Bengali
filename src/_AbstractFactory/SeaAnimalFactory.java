package _AbstractFactory;

public class SeaAnimalFactory extends AnimalFactory {
    @Override
    public Animal<String> getAnimal(String factoryType) {
       Animal<String> animal=null;
       if ("Shark".equals(factoryType))
       {
           animal=new Shark();
       }else if ("Octupas".equals(factoryType))
       {
           animal=new Octopus();
       }
       return animal;
    }
}
