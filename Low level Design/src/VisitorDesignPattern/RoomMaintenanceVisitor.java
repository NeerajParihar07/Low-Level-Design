package VisitorDesignPattern;

public class RoomMaintenanceVisitor implements RoomVisitor{
    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("Performing Maintenance for singleRoom");
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Performing Maintenance for doubleRoom");
    }

    @Override
    public void visit(DeluxRoom deluxRoom) {
        System.out.println("Performing Maintenance for deluxRoom");
    }
}
