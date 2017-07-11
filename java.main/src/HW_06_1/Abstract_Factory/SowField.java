package HW_06_1.Abstract_Factory;

import HW_06_1.Abstract_Factory.Sow.BrigadeSower;

public class SowField {
    public void sowField() {
        BrigadeFactory brigadeFactory = new BrigadeSower();
        Driver driver1 = brigadeFactory.getFirstDriver();
        Driver driver2 = brigadeFactory.getSecondDriver();
        Mechanic mechanic = brigadeFactory.getMechanic();

        System.out.println("Sowing Fields\n");
        driver1.drive();
        driver2.drive();
        mechanic.inspects();
    }
}
