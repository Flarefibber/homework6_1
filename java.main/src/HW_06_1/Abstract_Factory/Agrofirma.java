package HW_06_1.Abstract_Factory;

public class Agrofirma {
    public static void main(String[] args) {
        SowField sowField = new SowField();
        HarvestingFromTheField harvestingFromTheField = new HarvestingFromTheField();
        sowField.sowField();
        System.out.println("\n========================================\n");
        harvestingFromTheField.harvestingFromTheField();
    }
}
