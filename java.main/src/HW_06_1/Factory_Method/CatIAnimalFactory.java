package HW_06_1.Factory_Method;

public class CatIAnimalFactory implements IAnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
