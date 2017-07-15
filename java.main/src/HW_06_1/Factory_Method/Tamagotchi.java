package HW_06_1.Factory_Method;

public class Tamagotchi {
    public static void main(String[] args) {
        Animal animal1 = animalFactory(1);
        animal1.feed();
        animal1.treat();
        System.out.println("\n=======================================\n");
        Animal animal2 = animalFactory(2);
        animal2.feed();
        animal2.treat();
    }
    private static Animal tamagotchiRun(IAnimalFactory tamagotchiAnimal) {
        Animal animal = tamagotchiAnimal.createAnimal();
        return animal;
    }
    private static Animal animalFactory(int ID) {
        switch(ID) {
            case 1:
                IAnimalFactory iAnimalFactoryDog = new DogIAnimalFactory();
                System.out.println("Create a dog.");
                return tamagotchiRun(iAnimalFactoryDog);
            case 2:
                IAnimalFactory IAnimalFactoryCat = new CatIAnimalFactory();
                System.out.println("Create a cat.");
                return tamagotchiRun(IAnimalFactoryCat);
            default:
                System.out.println("There is no such animal.");
                return null;
        }
    }
}
