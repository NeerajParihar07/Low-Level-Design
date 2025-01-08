package MediatorDesignPattern;

public class Main {
    public static void main(String[] args) {
        AuctionMediator ac = new Auction();
        Colleague bidder1 = new Bidder("Jon", ac);
        Colleague bidder2 = new Bidder("kon", ac);

        bidder1.placeBid(10);
        bidder2.placeBid(20);
        bidder1.placeBid(39);
    }
}
