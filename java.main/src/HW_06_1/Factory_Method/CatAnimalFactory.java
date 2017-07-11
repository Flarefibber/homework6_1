package HW_06_1.Factory_Method;

public class CatAnimalFactory implements AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
