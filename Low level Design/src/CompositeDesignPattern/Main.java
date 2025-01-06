package CompositeDesignPattern;

public class Main {
    public static void main(String[] args) {
        Directory movieDirectory = new Directory("Movie");

        FileSystem m1 = new File("Article 375");
        movieDirectory.add(m1);

        Directory thrillerDirectory = new Directory("Thrillers");
        FileSystem m2 = new File("Mulholland Drive");
        thrillerDirectory.add(m2);

        movieDirectory.add(thrillerDirectory);

        movieDirectory.ls();


        // calculator example

        ArithmaticExpression two = new Number(2);
        ArithmaticExpression one = new Number(1);
        ArithmaticExpression sevem = new Number(7);


        ArithmaticExpression add = new Expression(one, sevem, Operation.ADD);
        ArithmaticExpression parent = new Expression(two, add, Operation.MULTIPLY);

        System.out.println(parent.evaluate());
    }
}
