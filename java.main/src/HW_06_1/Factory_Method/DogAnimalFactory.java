package HW_06_1.Factory_Method;

public class DogAnimalFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
