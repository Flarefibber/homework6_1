package HW_06_1.Abstract_Factory.Harvesting;

import HW_06_1.Abstract_Factory.BrigadeFactory;
import HW_06_1.Abstract_Factory.Driver;
import HW_06_1.Abstract_Factory.Mechanic;

public class BrigadeHarvesting implements BrigadeFactory {
    @Override
    public Driver getFirstDriver() {
        return new CombineHarvesterDriver();
    }

    @Override
    public Driver getSecondDriver() {
        return new TipperDriver();
    }

    @Override
    public Mechanic getMechanic() {
        return new MaintenanceOfMachines();
    }
}
