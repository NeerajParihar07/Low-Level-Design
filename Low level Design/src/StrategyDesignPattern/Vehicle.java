package StrategyDesignPattern;

import StrategyDesignPattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveObject;

    //Constructor injection
    Vehicle(DriveStrategy driveStrategy)
    {
        this. driveObject = driveStrategy;
    }

    public void drive(){
        driveObject.drive();
    }
}
