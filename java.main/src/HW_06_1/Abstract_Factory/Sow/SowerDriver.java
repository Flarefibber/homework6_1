package HW_06_1.Abstract_Factory.Sow;

import HW_06_1.Abstract_Factory.Driver;

public class SowerDriver implements Driver {
    @Override
    public void drive() {
        System.out.println("Sows the field");
    }
}
