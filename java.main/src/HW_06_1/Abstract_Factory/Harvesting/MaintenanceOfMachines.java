package HW_06_1.Abstract_Factory.Harvesting;

import HW_06_1.Abstract_Factory.Mechanic;

public class MaintenanceOfMachines implements Mechanic {
    @Override
    public void inspects() {
        System.out.println("The mechanic serves the combines");
    }
}
