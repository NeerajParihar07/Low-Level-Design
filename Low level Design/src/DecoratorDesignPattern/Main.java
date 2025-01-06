package DecoratorDesignPattern;

public class Main {
    public static void main(String[] args) {
        // BasePizza bp = new VegDelight();
        BasePizza bp = new Mushroom(new ExtraCheese(new VegDelight()));
        System.out.println("cost of extracheese  + vegdelight " + bp.cost());
    }
}

