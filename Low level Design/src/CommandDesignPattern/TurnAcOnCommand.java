package CommandDesignPattern;

public class TurnAcOnCommand implements ICommand{
    AirConditioner ac; // has-a relationship

    TurnAcOnCommand(AirConditioner ac)
    {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOnAC();
    }

    @Override
    public void undo() {
        ac.turnOffAC();
    }
}
