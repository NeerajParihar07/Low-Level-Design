package DecoratorDesignPattern;

public class VegDelight extends BasePizza {
    
    public VegDelight(){};

    @Override
    public int cost() {
        return 20;
    }
}
