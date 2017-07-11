package HW_06_1.Abstract_Factory.Harvesting;

import HW_06_1.Abstract_Factory.Driver;

public class CombineHarvesterDriver implements Driver {
    @Override
    public void drive() {
        System.out.println("Gathers the harvest from the field");
    }
}
