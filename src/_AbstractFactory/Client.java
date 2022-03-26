package _AbstractFactory;

public class Client {
    public static void main(String[] args) {
        Animal<String> animal;
        AnimalFactory animalFactory;
        String sound;
        animalFactory=AnimalFactory.getAnimalFactory("Sea");
        System.out.println("Animal Factory Type: "+animalFactory.getClass().getName());
        System.out.println("=========================================================");
        animal= animalFactory.getAnimal("Octupas");
        System.out.println("Animal Type: "+animal.getClass().getName());
        System.out.println("========================================================");
        sound=animal.Speak();
        System.out.println("Octupas Speak: "+sound);
    }

}
