package CommandDesignPattern;

public class AirConditioner {

    // this is the Receiver component of command design pattern;

    boolean isOn;
    int temperature;

    public void turnOnAC(){
        isOn = true;
        System.out.println("AC is ON");
    }

    public void turnOffAC()
    {
        isOn = false;
        System.out.println("AC is OFF");
    }

    public void setTemperature(int temp)
    {
        this.temperature = temp;
        System.out.println("temperature is changed to " + temperature);
    }
}
