package DecoratorDesignPattern;

public class ExtraCheese extends ToppingDecorator{
    BasePizza bp;
    public ExtraCheese(BasePizza p){this.bp  = p;}

    @Override
    public int cost() {
        System.out.println("ExtraCheese cost " + (int)(this.bp.cost() + 10));
        return this.bp.cost() + 10;
    }
}
