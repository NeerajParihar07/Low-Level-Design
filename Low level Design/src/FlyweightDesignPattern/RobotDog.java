package FlyweightDesignPattern;

public class RobotDog implements IRobot{
    private String type;
    private Sprites body;

    RobotDog(String type, Sprites Body){
        this.type = type;
        this.body = body;
    }

    public String getType(){return type;}

    public Sprites getBody(){return body;}

    @Override
    public void display(int x, int y) {
        System.out.println("Robot " + this.type + " " + x + " " + y);
    }


}
