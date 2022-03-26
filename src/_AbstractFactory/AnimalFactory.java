package _AbstractFactory;

public abstract class AnimalFactory {
    public abstract Animal<String> getAnimal(String factoryType);
    public static AnimalFactory getAnimalFactory(String factoryType)
    {
        AnimalFactory animalFactory=null;
        if ("Sea".equals(factoryType))
        {
            animalFactory=new SeaAnimalFactory();
        }
        else
        {
            animalFactory=new LandAnimalFactory();
        }
        return animalFactory;
    }

}
