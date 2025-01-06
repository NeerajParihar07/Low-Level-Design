package StrategyDesignPattern;

import StrategyDesignPattern.Strategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle{
    NormalVehicle(){
        super(new NormalDriveStrategy());
    }
}
