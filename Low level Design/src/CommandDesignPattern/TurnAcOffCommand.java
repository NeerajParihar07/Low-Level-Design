package CommandDesignPattern;

public class TurnAcOffCommand implements ICommand {

    // this is the commmand part of the command design pattern

    AirConditioner ac;

    public TurnAcOffCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOffAC();
    }

    @Override
    public void undo() {
        ac.turnOnAC();
    }
}
