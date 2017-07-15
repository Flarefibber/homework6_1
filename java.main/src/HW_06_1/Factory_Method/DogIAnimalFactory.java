package HW_06_1.Factory_Method;

public class DogIAnimalFactory implements IAnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
