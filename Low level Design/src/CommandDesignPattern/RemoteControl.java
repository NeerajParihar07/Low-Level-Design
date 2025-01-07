package CommandDesignPattern;

import java.util.Stack;

public class RemoteControl {
    // this is the invoker class of the command design pattern, with which the clients interacts;

    Stack<ICommand> history = new Stack<>(); // to keep track of the commands executed so far

    ICommand command;

    RemoteControl(){}

    public void setCommand(ICommand cmd)
    {
        this.command = cmd;
        history.add(cmd);
    }

    public void pressButton(){
        command.execute();
    }

    public void undo()
    {
        if(!history.isEmpty())
        {
            ICommand lastCommand = history.pop();
            lastCommand.undo();
        }
    }
}
