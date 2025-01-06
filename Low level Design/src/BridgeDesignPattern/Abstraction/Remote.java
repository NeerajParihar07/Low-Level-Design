package BridgeDesignPattern.Abstraction;

import BridgeDesignPattern.Implementation.Device;

public class Remote {
    Device device;

    public Remote(Device device){this.device = device;}

    public void togglePower(){
        if(this.device.isEnabled())this.device.disable();
        else this.device.enable();
    }

    public void volumeDown(){
        device.setVolume(device.getVolume()-10);
    }

    public void volumeUp(){
        device.setVolume(device.getVolume()+10);
    }

    public void channelDown(){
        device.setChannel(device.getChannel()-1);
    }

    public void channelUp(){
        device.setChannel(device.getChannel()+1);
    }

}
