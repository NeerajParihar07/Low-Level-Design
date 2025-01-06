package StrategyDesignPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle normalVehicle = new NormalVehicle();
        Vehicle sporstsVehicle = new SportsVehicle();

        normalVehicle.drive();
        sporstsVehicle.drive();
    }
}
