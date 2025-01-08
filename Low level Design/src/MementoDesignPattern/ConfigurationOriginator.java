package MementoDesignPattern;

public class ConfigurationOriginator {
    public int height;
    public int width;

    ConfigurationOriginator(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void setHeight(int h){
        this.height = h;
    }

    public void setWidth(int w){
        this.width = w;
    }

    public ConfigurationMemento createMemento(){
        return new ConfigurationMemento(this.height, this.width);
    }

    public void restoreMemento(ConfigurationMemento mementoToBeRestored){
        this.height = mementoToBeRestored.height;
        this.width = mementoToBeRestored.width;
    }
    
}
