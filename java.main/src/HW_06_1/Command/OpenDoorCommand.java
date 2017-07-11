package HW_06_1.Command;

public class OpenDoorCommand implements Command{
    private Door door;

    public OpenDoorCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.open();
    }
}
