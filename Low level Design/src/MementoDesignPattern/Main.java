package MementoDesignPattern;

public class Main {
    public static void main(String[] args) {
        ConfigurationCareTaker careTaker = new ConfigurationCareTaker();
        ConfigurationOriginator originator = new ConfigurationOriginator(5, 10);

        ConfigurationMemento snapshot1 = originator.createMemento();

        careTaker.addMemento(snapshot1);

        originator.setHeight(7);
        originator.setWidth(12);

        ConfigurationMemento snapshot2 = originator.createMemento();

        careTaker.addMemento(snapshot2);

        originator.setHeight(13);
        originator.setWidth(23);

        ConfigurationMemento snapshot3 = originator.createMemento();

        // careTaker.addMemento(snapshot3);

        ConfigurationMemento restoreState = careTaker.undo();
        System.out.println("last state " + restoreState.height + " + "+ restoreState.width);
        originator.restoreMemento(restoreState);

        System.out.println("values "+ originator.height + " " + originator.width);
    }
}
