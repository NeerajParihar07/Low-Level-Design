package BridgeDesignPattern;

import BridgeDesignPattern.Abstraction.Remote;
import BridgeDesignPattern.Implementation.Device;
import BridgeDesignPattern.Implementation.TV;
import BridgeDesignPattern.Implementation.Radio;

public class Main {
    public static void main(String[] args) {
        Remote tv_rm = new Remote(new TV());

        Remote radio_rm = new Remote(new Radio());

        tv_rm.togglePower();
        radio_rm.togglePower();
    }
}
