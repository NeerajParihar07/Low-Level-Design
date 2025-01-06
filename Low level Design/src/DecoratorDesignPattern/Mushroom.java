package DecoratorDesignPattern;

public class Mushroom extends ToppingDecorator{
    BasePizza bp;

    public Mushroom(BasePizza p){this.bp = p;}

    @Override
    public int cost() {
        System.out.println("Mushroom " + (int)(this.bp.cost() + 20));
        return this.bp.cost()+20;
    }
}
