package HW_06_1.Abstract_Factory;

import HW_06_1.Abstract_Factory.Harvesting.BrigadeHarvesting;

public class HarvestingFromTheField {
    public void harvestingFromTheField() {
        BrigadeFactory brigadeFactory = new BrigadeHarvesting();
        Driver driver1 = brigadeFactory.getFirstDriver();
        Driver driver2 = brigadeFactory.getSecondDriver();
        Mechanic mechanic = brigadeFactory.getMechanic();

        System.out.println("Harvesting\n");
        driver1.drive();
        driver2.drive();
        mechanic.inspects();
    }
}
