package HW_06_1.Strategy;

public class ConcreteStrategyMultiply implements Strategy{
    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}
