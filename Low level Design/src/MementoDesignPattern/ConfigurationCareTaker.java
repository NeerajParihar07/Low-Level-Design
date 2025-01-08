package MementoDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationCareTaker {
    List<ConfigurationMemento> history = new ArrayList<>();

    public void addMemento(ConfigurationMemento memento){
        history.add(memento);
    }

    public ConfigurationMemento undo(){
        if(history.isEmpty())return null;
        int last = history.size() - 1;
        ConfigurationMemento lastState = history.get(last);
        history.remove(last);
        return lastState;
    }
}
