package CompositeDesignPattern;

public class Number implements ArithmaticExpression {
    int value;

    public Number(int v){this.value = v;}

    @Override
    public int evaluate() {
        System.out.println("Number " + value);
        return value;
    }
}
