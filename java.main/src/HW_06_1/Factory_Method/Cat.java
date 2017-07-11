package HW_06_1.Factory_Method;

public class Cat implements Animal {
    @Override
    public void feed() {
        System.out.println("The cat is fed.");
    }

    @Override
    public void treat() {
        System.out.println("The cat is cured.");
    }
}
