package VisitorDesignPattern;

public class RoomPricingVisitor implements  RoomVisitor{
    
    @Override
    public void visit(SingleRoom singleRoom) {
        // TODO Auto-generated method stub

        System.out.println("Pricing Computation for single Room");
        singleRoom.roomPrice = 1000;
        
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        // TODO Auto-generated method stub

        System.out.println("Pricing Computation for Double Room");
        doubleRoom.roomPrice = 2000;
        
    }

    @Override
    public void visit(DeluxRoom deluxRoom) {
        // TODO Auto-generated method stub
         System.out.println("Pricing Computation for single Room");
        deluxRoom.roomPrice = 2500;
    }

}
