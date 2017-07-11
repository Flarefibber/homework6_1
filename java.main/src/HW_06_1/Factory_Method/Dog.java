package HW_06_1.Factory_Method;

public class Dog implements Animal {

    @Override
    public void feed() {
        System.out.println("The dog is fed.");
    }

    @Override
    public void treat() {
        System.out.println("The dog is cured.");
    }
}
