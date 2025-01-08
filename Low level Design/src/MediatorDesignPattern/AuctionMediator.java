package MediatorDesignPattern;

public interface AuctionMediator {
    void addBidder(Colleague bidder);
    void placeBid(Colleague Bidder, int amount);
}
