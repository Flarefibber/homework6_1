package HW_06_1.Abstract_Factory.Harvesting;

import HW_06_1.Abstract_Factory.Driver;

public class TipperDriver implements Driver{
    @Override
    public void drive() {
        System.out.println("Carries a crop");
    }
}
