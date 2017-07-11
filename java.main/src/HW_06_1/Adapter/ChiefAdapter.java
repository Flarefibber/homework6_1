package HW_06_1.Adapter;

public class ChiefAdapter implements Chief{
    private Plumber plumber = new Plumber();
    @Override
    public Object makeBreakfast() {
        return plumber.getKey();
    }

    @Override
    public Object makeDinner() {
        return plumber.getScrewDriver();
    }

    @Override
    public Object makeSupper() {
        return plumber.getPipe();
    }
}
