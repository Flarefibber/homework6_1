package HW_06_1.Abstract_Factory;

import HW_06_1.Abstract_Factory.Harvesting.BrigadeHarvesting;
import HW_06_1.Abstract_Factory.Sow.BrigadeSower;

public class Agrofirma {
    public static void main(String[] args) {
        agrofirmaFactory(1);
        System.out.println("\n========================================\n");
        agrofirmaFactory(2);
    }

    private static void agrofirmaRun(BrigadeFactory brigadeFactory) {

        Driver driver1 = brigadeFactory.getFirstDriver();
        Driver driver2 = brigadeFactory.getSecondDriver();
        Mechanic mechanic = brigadeFactory.getMechanic();
        driver1.drive();
        driver2.drive();
        mechanic.inspects();
    }
    private static void agrofirmaFactory(int ID) {
        switch(ID) {
            case 1:
                BrigadeFactory brigadeFactory1 = new BrigadeHarvesting();
                System.out.println("Harvesting\n");
                agrofirmaRun(brigadeFactory1);
                break;
            case 2:
                BrigadeFactory brigadeFactory2 = new BrigadeSower();
                System.out.println("Sowing Fields\n");
                agrofirmaRun(brigadeFactory2);
                break;
            default:
                System.out.println("There are no such field works.");
                break;
        }
    }
}
