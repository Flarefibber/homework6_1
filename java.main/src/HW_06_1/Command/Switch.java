package HW_06_1.Command;

public class Switch {
    private Command openCommand;
    private Command closeCommand;

    public Switch(Command openCommand,Command closeCommand){
        this.openCommand=openCommand;
        this.closeCommand=closeCommand;
    }

    public void open(){
        openCommand.execute();
    }

    public void close(){
        closeCommand.execute();
    }
}
