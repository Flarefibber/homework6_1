package HW_06_1.Factory_Method;

public class Tamagotchi {
    public static void main(String[] args) {
        AnimalFactory animalFactoryDog = new DogAnimalFactory();
        Animal animalDog = animalFactoryDog.createAnimal();
        System.out.println("Create a dog.");
        animalDog.feed();
        animalDog.treat();
        System.out.println("\n=======================================\n");
        System.out.println("Create a cat.");
        AnimalFactory animalFactoryCat = new DogAnimalFactory();
        Animal animalCat = animalFactoryCat.createAnimal();
        animalCat.feed();
        animalCat.treat();
    }
}
