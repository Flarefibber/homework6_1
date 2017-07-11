package HW_06_1.Command;

public class RemoteController {
    public static void main(String[] args) {
        Door door = new Door();
        Command switchOpen =new OpenDoorCommand(door);
        Command switchClose =new CloseDoorCommand(door);

        Switch remoteController=new Switch(switchOpen,switchClose);

        remoteController.open();
        remoteController.close();
    }
}
