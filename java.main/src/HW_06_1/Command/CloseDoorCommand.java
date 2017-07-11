package HW_06_1.Command;

public class CloseDoorCommand implements Command{

    private Door door;

    public CloseDoorCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.close();
    }
}
