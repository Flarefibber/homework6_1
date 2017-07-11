package HW_06_1.Abstract_Factory.Sow;

import HW_06_1.Abstract_Factory.BrigadeFactory;
import HW_06_1.Abstract_Factory.Driver;
import HW_06_1.Abstract_Factory.Mechanic;

public class BrigadeSower implements BrigadeFactory{

    @Override
    public Driver getFirstDriver() {
        return new SowerDriver();
    }

    @Override
    public Driver getSecondDriver() {
        return new SowerDriver();
    }

    @Override
    public Mechanic getMechanic() {
        return new MaintenanceOfMachines();
    }
}
