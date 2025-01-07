package FlyweightDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class RoboticFactory {
    private static Map<String, IRobot> roboticCache = new HashMap<>();

    public static IRobot createRobot(String robotType){
        if(roboticCache.containsKey(robotType))return roboticCache.get(robotType);  
        else{
            if(robotType == "HUMANOID"){
                Sprites HumanoidSprite = new Sprites();
                IRobot humanoidObject = (IRobot)(new  HumanoidRobot(robotType, HumanoidSprite));
                roboticCache.put(robotType, humanoidObject);
                return humanoidObject;
            }
            else if(robotType == "ROBOTICDOG"){
                Sprites roboticDogSprite = new Sprites();
                IRobot roboticDog = (IRobot)(new RobotDog(robotType, roboticDogSprite));
                roboticCache.put(robotType, roboticDog);
                return roboticDog;
            }
        }
        return null;
    }
}
