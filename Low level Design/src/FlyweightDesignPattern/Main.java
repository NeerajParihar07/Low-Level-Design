package FlyweightDesignPattern;

public class Main {
    public static void main(String[] args) {
        IRobot humanoidRobot1 = RoboticFactory.createRobot("HUMANOID");
        humanoidRobot1.display(1, 2);
        IRobot humanoidRobot2 = RoboticFactory.createRobot("HUMANOID");
        humanoidRobot2.display(3,4);

        IRobot rd1 = RoboticFactory.createRobot("ROBOTICDOG");
        rd1.display(5, 6);
        IRobot rd2 = RoboticFactory.createRobot("ROBOTICDOG");
        rd2.display(7,8);
    }
}
