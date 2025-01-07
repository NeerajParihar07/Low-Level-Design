package CommandDesignPattern;

public class Main {
    public static void main(String[] args) {
        // we need an ac;
        // we need the command to that we want to execute

        AirConditioner ac = new AirConditioner();

        ICommand cmd = new TurnAcOnCommand(ac);

        RemoteControl rc = new RemoteControl();

        rc.setCommand(cmd);

        rc.pressButton();

        rc.undo();
    }
}
