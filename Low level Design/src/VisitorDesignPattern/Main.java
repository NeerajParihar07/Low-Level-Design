package VisitorDesignPattern;

public class Main {
    public static void main(String[] args) {
        RoomElement singleRoom = new SingleRoom();
        RoomElement doubleRoom = new DoubleRoom();
        RoomElement deluxRoom = new DeluxRoom();

        RoomVisitor pricingRoomVisitor = new RoomPricingVisitor();

        singleRoom.accept(pricingRoomVisitor);
        System.out.println(((SingleRoom)singleRoom).roomPrice);

        doubleRoom.accept(pricingRoomVisitor);
        System.out.println(((DoubleRoom)doubleRoom).roomPrice);

        deluxRoom.accept(pricingRoomVisitor);
        System.out.println(((DeluxRoom)deluxRoom).roomPrice);

    }
}
