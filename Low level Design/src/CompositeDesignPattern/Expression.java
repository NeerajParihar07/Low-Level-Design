package CompositeDesignPattern;

import java.lang.management.ThreadInfo;

public class Expression implements ArithmaticExpression{
    ArithmaticExpression leftExpression;
    ArithmaticExpression rightExpression;

    Operation operation;

    public Expression(ArithmaticExpression lft, ArithmaticExpression rgt, Operation op){
        leftExpression = lft;
        rightExpression = rgt;
        this.operation = op;
    }

    @Override
    public int evaluate() {
        int value = 0;

        switch(this.operation){
            case ADD:
                value = leftExpression.evaluate() + rightExpression.evaluate();
                break;
            case SUBTRACT:
                value = leftExpression.evaluate() - rightExpression.evaluate();
                break;
            case DIVIDE:
                value = leftExpression.evaluate() / rightExpression.evaluate();
                break;
            case MULTIPLY:
                value = leftExpression.evaluate() * rightExpression.evaluate();
                break;
        }

        System.out.println("Expression value is " + value);

        return value;
    }
}
