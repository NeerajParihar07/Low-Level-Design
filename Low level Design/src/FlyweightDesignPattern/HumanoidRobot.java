package FlyweightDesignPattern;

public class HumanoidRobot implements IRobot {

    // this is the main part of flyweight object, to keep the shared object for shared data among all the objects. 

    private String type;
    private Sprites body;

    public HumanoidRobot(String type, Sprites body) {
        this.type = type;
        this.body = body;
    }

    public String getType(){
        return type;
    }

    public Sprites getBody(){
        return body;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Robot " + this.type + " " + x + " " + y);
    }

}
